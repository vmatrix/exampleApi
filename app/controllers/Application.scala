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

  // http://peter-braun.org/2012/06/fibonacci-numbers-in-scala/
  def fibo( n : Int) : Int = {
    def fib_tail( n: Int, a:Int, b:Int): Int = n match {
      case 0 => a
      case _ => fib_tail( n-1, b, (a+b)%1000000 )
    }
    //return fib_tail( n%1500000, 0, 1)
    fib_tail( n%1500000, 0, 1)
  }

  def getFibo(num:Int) = Action{
    Ok("You Fibonacci for " + num + " is " + fibo(num).toString)  //get string from Int
  }


}