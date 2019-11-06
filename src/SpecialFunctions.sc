object SpecialFunctions {
  println("Welcome to Scala Worksheet")           //> Welcome to Scala Worksheet

  ((x: Int) => x + 1)(5)                          //> res0: Int = 6

  val f = (x: Int) => x + 2                       //> f  : Int => Int = SpecialFunctions$$$Lambda$9/483422889@7c75222b
  f(5)                                            //> res1: Int = 7
  f.apply(3)                                      //> res2: Int = 5

  val doubler = (i: Int) => i * 2                 //> doubler  : Int => Int = SpecialFunctions$$$Lambda$10/1277181601@27f674d
  doubler(6)                                      //> res3: Int = 12

  def someOperation(f: (Int, Int) => Int): Unit = println(f(5, 5))
                                                  //> someOperation: (f: (Int, Int) => Int)Unit
  val add = (x: Int, y: Int) => x + y             //> add  : (Int, Int) => Int = SpecialFunctions$$$Lambda$11/1239731077@2133c8f8
                                                  //| 
  someOperation(add)                              //> 10

  def greeting(): String => String = (name: String) => "Hello " + name
                                                  //> greeting: ()String => String
  val g = greeting()                              //> g  : String => String = SpecialFunctions$$$Lambda$12/1134712904@3ac3fd8b
  g("Peggy")                                      //> res4: String = Hello Peggy

  var y = 5                                       //> y  : Int = 5
  val multiplier = (x: Int) => x * y              //> multiplier  : Int => Int = SpecialFunctions$$$Lambda$13/2137211482@36d64342
                                                  //| 
  multiplier(4)                                   //> res5: Int = 20
}