object Repetition extends App {
  var i = 5
  while (i >= 0) {
    print(i + ", ")
    i -= 1
  }
  println // print line

  val fruit = List("apples", "bananas", "cherries", "pears")
  for (f <- fruit)
    println(f)
  println

  // print fruit starting with 'c' use filtering
  for (f <- fruit if (f.startsWith("c")))
    println("fruits starting with c: " + f)
  println

  //nested for loop
  for (i <- 1 to 5; j <- 1 to 5)
    print(i * j + ", ")
  println

  // for each even number between 1 and 10, square it, expected result: 4, 16, 36, 64, 100
  val result = for (n <- 1 to 10; e = n % 2; if e == 0) yield n * n
  println(result)
  println

  // sum each pair of numbers, expected result: 3, 7, 11
  val list = List((1, 2), (3, 4), (5, 6))
  val sumList = for ((a, b) <- list) yield a + b
  println(sumList)
  println

  // create a vector of numbers pairs
  val numbersPairs = for (x <- 0 to 4; y <- 0 until 3) yield (x, y)
  println(numbersPairs)
  println
}
