package coursera

object factorial {
  def fact(x: Int): Int =
    if (x == 0) 1 else x * fact(x - 1)            //> fact: (x: Int)Int

  def sumFactorials(a: Int, b: Int): Int =
    if (a > b) 0 else fact(a) + sumFactorials(a + 1, b)
                                                  //> sumFactorials: (a: Int, b: Int)Int

  println(sumFactorials(0, 5))                    //> 154

  println(fact(0) + fact(1) + fact(2) + fact(3) + fact(4) + fact(5))
                                                  //> 154

  def sum(f: Int => Int)(a: Int, b: Int): Int = {

    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }

    loop(a, 0)
  }                                               //> sum: (f: Int => Int)(a: Int, b: Int)Int

  val result = sum({ x => x * x })(3, 5)          //> result  : Int = 50

  println(result)                                 //> 50
}