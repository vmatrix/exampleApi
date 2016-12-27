package controllers

import play.api._
import play.api.mvc._

case class Person(name: String, country: String, id: Int)


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