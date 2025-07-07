package controllers

import play.api.mvc._ //para BaseController
import javax.inject.Singleton //singleton
import javax.inject._ //@Inject
import play.api.libs.json._
import scala.collection.mutable //mutable
import models.TodoListItem
import DTO.NewTodoListItem

//@Singleton cria apenas uma instancia dessa classe
@Singleton //@Inject resolve dependencias da classe automaticamente
class TodoListController @Inject() (
    val controllerComponents: ControllerComponents
) extends BaseController {
  // Action da acesso aos parametros da request
  // e pode retornar uma response HTTP
  private var todoList = new mutable.ListBuffer[TodoListItem]()
  todoList += TodoListItem(1, "test", true)
  todoList += TodoListItem(2, "some other value", false)

  implicit val todoListJson = Json.format[TodoListItem]

  implicit val newTodoListJson = Json.format[NewTodoListItem]

  def getAll(): Action[AnyContent] = Action {
    if (todoList.isEmpty) {
      NoContent
    } else {
      Ok(Json.toJson(todoList))
    }
  }

  def getById(itemId: Long) = Action {
    val foundItem = todoList.find(_.id == itemId)
    foundItem match {
      case Some(item) => Ok(Json.toJson(item))
      case None       => NotFound(Json.toJson(("erro: id não encontrado")))
    }
  }

  def addNewItem() = Action { implicit request =>
    val content = request.body
    println(content)
    val jsonObject = content.asJson
    val todoListItem: Option[NewTodoListItem] =
      jsonObject.flatMap(
        Json.fromJson[NewTodoListItem](_).asOpt
      )

    todoListItem match {
      case Some(newItem) =>
        val nextId = todoList.map(_.id).max + 1
        val toBeAdded = TodoListItem(nextId, newItem.description, false)
        todoList += toBeAdded
        Created(Json.toJson(toBeAdded))
      case None =>
        BadRequest(Json.toJson("Erro: Bad Request"))
    }
  }

  def markAsDone(itemId: Long) = Action {
    var foundItem = todoList.find(_.id == itemId)
    foundItem match {
      case Some(item) =>
        item.isItDone = true
        Created(Json.toJson("Item " + itemId + " marcado como pronto"))
      case None =>
        NotFound("Item " + itemId + " Não encontrado")
    }
  }

  def deleteAllDone() = Action {

    todoList = todoList.filterNot(_.isItDone)

    Ok(Json.toJson("Itens finalizados removidos com sucesso"))
  }
}
