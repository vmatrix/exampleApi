package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new scala application is ready."))
  }

  def getName = Action {
    Ok("Mary")
  }

  def getPicture(name: String) = Action{

    Ok( name +  ".jpg")

  }


}