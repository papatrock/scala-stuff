error id: file://<WORKSPACE>/quehoraseuvouembora/app/controllers/TodoListController.scala:api.
file://<WORKSPACE>/quehoraseuvouembora/app/controllers/TodoListController.scala
empty definition using pc, found symbol in pc: api.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -play/api/mvc/play/api.
	 -play/api.
	 -scala/Predef.play.api.
offset: 12
uri: file://<WORKSPACE>/quehoraseuvouembora/app/controllers/TodoListController.scala
text:
```scala
import play.@@api.mvc._ //para BaseController
import javax.inject.Singleton //singleton

//@Singleton cria apenas uma instancia dessa classe
@Singleton              //@Inject resolve dependencias da classe automaticamente
class TodoListController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
                //Action da acesso aos parametros da request
                //e pode retornar uma response HTTP
    def getAll() : Action[AnyContent] = Action {
        NoContent //retonar  status NoContent
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: api.