object MyApp extends App {
  def divisors(n: Int): List[Int] =
    for (i <- List.range(1, n + 1) if n % i == 0) yield i

  def isPrime(n: Int) = divisors(n).length == 2

  if (isPrime(20)) println("It is a prime number") else println("It is not prime")
}
