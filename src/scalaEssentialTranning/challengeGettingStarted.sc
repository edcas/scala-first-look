package scalaEssentialTranning

object challengeGettingStarted {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def add(x: Int, y: Int): Int = x + y            //> add: (x: Int, y: Int)Int
  def subtract(x: Int, y: Int): Int = x - y       //> subtract: (x: Int, y: Int)Int
  
  val addTest = add(10, 20)                       //> addTest  : Int = 30
  val subtractTest = subtract(10, 20)             //> subtractTest  : Int = -10
  val addCustomTest = add(5, 6)                   //> addCustomTest  : Int = 11
}