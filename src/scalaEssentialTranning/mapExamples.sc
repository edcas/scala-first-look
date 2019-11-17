package scalaEssentialTranning

object mapExamples {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var groceries = Map(1 -> "Milk", 2 -> "Bread", 3 -> "Juice", 4 -> "Eggs")
                                                  //> groceries  : scala.collection.immutable.Map[Int,String] = Map(1 -> Milk, 2 -
                                                  //| > Bread, 3 -> Juice, 4 -> Eggs)
  groceries = groceries + (5-> "Hashbrowns")
 	groceries.get(5)                          //> res0: Option[String] = Some(Hashbrowns)
	groceries(3)                              //> res1: String = Juice
	groceries.getOrElse(6, "Not match")       //> res2: String = Not match
	for(v <- groceries.values) println(v)     //> Hashbrowns
                                                  //| Milk
                                                  //| Bread
                                                  //| Juice
                                                  //| Eggs
  var z = for((k, v) <- groceries) yield (v, k)   //> z  : scala.collection.immutable.Map[String,Int] = Map(Milk -> 1, Juice -> 3,
                                                  //|  Hashbrowns -> 5, Eggs -> 4, Bread -> 2)
  groceries.foreach(println)                      //> (5,Hashbrowns)
                                                  //| (1,Milk)
                                                  //| (2,Bread)
                                                  //| (3,Juice)
                                                  //| (4,Eggs)
  
}