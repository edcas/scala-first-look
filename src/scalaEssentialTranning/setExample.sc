package scalaEssentialTranning

object setExample {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val fruits = Set("Apple", "Orange", "Banana")   //> fruits  : scala.collection.immutable.Set[String] = Set(Apple, Orange, Banana
                                                  //| )
  var moreFruits = Set("Kiwi", "Pineapple")       //> moreFruits  : scala.collection.immutable.Set[String] = Set(Kiwi, Pineapple)
                                                  //| 
  var nums = Set(1, 2, 3, 4, 5, 6)                //> nums  : scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)
  var moreNums = Set(6, 7, 8, 9)                  //> moreNums  : scala.collection.immutable.Set[Int] = Set(6, 7, 8, 9)
	
	nums.contains(5)                          //> res0: Boolean = true
	nums.contains(0)                          //> res1: Boolean = false
	nums(3)                                   //> res2: Boolean = true

	var mixed = fruits ++ nums                //> mixed  : scala.collection.immutable.Set[Any] = Set(5, Banana, 1, 6, Apple, 2
                                                  //| , 3, Orange, 4)
  nums -= 5
	println(nums)                             //> Set(1, 6, 2, 3, 4)
	nums & moreNums                           //> res3: scala.collection.immutable.Set[Int] = Set(6)

	moreFruits.head                           //> res4: String = Kiwi
	moreFruits.tail                           //> res5: scala.collection.immutable.Set[String] = Set(Pineapple)
	moreNums.isEmpty                          //> res6: Boolean = false
}