object collections {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var movies: Map[String, String] = Map("Finding Nemo" -> "G", "Finding Dory" -> "PG", "Men in Black" -> "PG-13", "The Avengers" -> "PG-13")
                                                  //> movies  : Map[String,String] = Map(Finding Nemo -> G, Finding Dory -> PG, Me
                                                  //| n in Black -> PG-13, The Avengers -> PG-13)

  var rating = movies("The Avengers")             //> rating  : String = PG-13
  println(rating)                                 //> PG-13
  
  movies.foreach(println)                         //> (Finding Nemo,G)
                                                  //| (Finding Dory,PG)
                                                  //| (Men in Black,PG-13)
                                                  //| (The Avengers,PG-13)
	movies += "Harry Potter and The Sorcerer's Stone" -> "PG"
	movies.foreach(println)                   //> (The Avengers,PG-13)
                                                  //| (Men in Black,PG-13)
                                                  //| (Finding Nemo,G)
                                                  //| (Finding Dory,PG)
                                                  //| (Harry Potter and The Sorcerer's Stone,PG)
}