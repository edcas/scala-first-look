package scalaEssentialTranning

object arrayChallengeExample extends App {
  def average(elements: Array[Int]): Double = {
    var sum = 0
    for (elem <- elements) yield sum += elem

    sum / elements.length
  }

  def minimum(elements: Array[Int]) = {
    var min = elements(0)
    for(elem <- elements) if (elem < min) min = elem
    
    min
  }
  
  def maximum(elements: Array[Int]) = {
    var max = elements(0)
    for(elem <- elements) if (elem > max) max = elem
    
    max
  }
  
  var elements = Array(10, 20, 35, 4, 34, 45, 100)
  println("Average is: " + average(elements))
  println("Minimum is: " + minimum(elements))
  println("Maximum is: " + maximum(elements))
}