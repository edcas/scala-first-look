object challengeUpperCaseAndLowerCase {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var grades = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97)
                                                  //> grades  : List[Int] = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97)
  for(g <- grades) if(g > 92) println("A")
  else if (g > 85) println("B")
 	else println("F")                         //> A
                                                  //| A
                                                  //| F
                                                  //| F
                                                  //| B
                                                  //| F
                                                  //| B
                                                  //| A
                                                  //| F
                                                  //| A
  var count : Double = 0.0                        //> count  : Double = 0.0
  for(g <- grades) count = count + 1
 	val sum = grades.foldLeft(0.0)(_+_)       //> sum  : Double = 857.0
  def avg(c: Double): Double = {sum / c}          //> avg: (c: Double)Double
 	println(avg(count))                       //> 85.7
}