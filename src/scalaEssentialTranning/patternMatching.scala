package scalaEssentialTranning

object patternMatching extends App {
  def greekAlphabet(letter: Char) = {
    letter match {
      case 'a' | 'A' => "Alpha"
      case 'b' | 'B' => "Beta"
      case _ => println("You entered an invalid character")
    }
  }
  
  print(s"The greek letter fro C is: ")
  greekAlphabet('C')
  
  def max(x: Int, y: Int): Int = x > y match {
    case true => x
    case false => y
  }
  
  println("Max: " + max(5, 20))
}