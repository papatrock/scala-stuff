error id: file://<WORKSPACE>/quehoraseuvouembora/app/controllers/TodoListController.scala:`<none>`.
file://<WORKSPACE>/quehoraseuvouembora/app/controllers/TodoListController.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -BaseController#
	 -scala/Predef.BaseController#
offset: 233
uri: file://<WORKSPACE>/quehoraseuvouembora/app/controllers/TodoListController.scala
text:
```scala
//@Singleton cria apenas uma instancia dessa classe
@Singleton              //@Inject resolve dependencias da classe automaticamente
class TodoListController @Inject()(val controllerComponents: ControllerComponents) extends BaseContr@@oller {
                //Action da acesso aos parametros da request
                //e pode retornar uma response HTTP
    def getAll() : Action[AnyContent] = Action {
        NoContent //retonar  status NoContent
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.