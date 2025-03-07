package controllers

import play.api.mvc._
import play.api.Play.current
import play.api.i18n.Messages.Implicits._

object Application extends Controller {
  def index = Action { implicit request =>
    // Redireciona para a página de listagem de produtos
    Redirect(routes.Products.list())
  }
}
