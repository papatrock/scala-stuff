//@Singleton cria apenas uma instancia dessa classe
@Singleton              //@Inject resolve dependencias da classe automaticamente
class TodoListController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
                //Action da acesso aos parametros da request
                //e pode retornar uma response HTTP
    def getAll() : Action[AnyContent] = Action {
        NoContent //retonar  status NoContent
    }
}
