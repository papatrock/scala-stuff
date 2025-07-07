error id: file://<WORKSPACE>/quehoraseuvouembora/app/controllers/HomeController.scala:`<none>`.
file://<WORKSPACE>/quehoraseuvouembora/app/controllers/HomeController.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -javax/inject/play.
	 -play/api/play.
	 -play/api/mvc/play.
	 -play.
	 -scala/Predef.play.
offset: 54
uri: file://<WORKSPACE>/quehoraseuvouembora/app/controllers/HomeController.scala
text:
```scala
package controllers

import javax.inject._
import play@@.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def hello(name: String) = Action {
    Ok(views.html.hello(name))
  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.