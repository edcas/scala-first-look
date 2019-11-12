package coursera

object higherOrderFunctions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts(a + 1, b)       //> sumInts: (a: Int, b: Int)Int

  def cube(x: Int): Int = x * x * x               //> cube: (x: Int)Int
  
	def sumCubes(a: Int, b: Int): Int =
		if(a > b) 0 else cube(a) + sumCubes(a + 1, b)
                                                  //> sumCubes: (a: Int, b: Int)Int
  sumCubes(1, 3)
}