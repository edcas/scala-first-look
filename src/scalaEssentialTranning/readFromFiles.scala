package scalaEssentialTranning

import io.Source._

object readFromFiles extends App {
  val currentDirectory = new java.io.File(".").getCanonicalPath
  val filename = currentDirectory + "/rainbow.txt"
  
  for(line <- fromFile(filename).getLines()) 
    println(line.toUpperCase())
    
  val poemLines = fromFile(currentDirectory + "/poem.txt").getLines().toList
  poemLines.foreach(println)
}