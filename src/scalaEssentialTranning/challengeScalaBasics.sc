package scalaEssentialTranning

object challengeScalaBasics {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val rate = 10.5                                 //> rate  : Double = 10.5
  def calculePaycheck(hourly: Double) = {
    if (hourly <= 40) s"Weekly paycheck is ${hourly * rate}"
    else s"Weekly paycheck is ${40 * rate + (hourly - 40) * rate * 1.5}"
  }                                               //> calculePaycheck: (hourly: Double)String

  def payroll(typeEmployee: String, hourly: Double) = {
    if (typeEmployee == "hourly") {
      calculePaycheck(hourly)
    } else {
      "This is a salaried employee"
    }
  }                                               //> payroll: (typeEmployee: String, hourly: Double)String

	println(payroll("hourly", 20))            //> Weekly paycheck is 210.0
	println(payroll("hourly", 40))            //> Weekly paycheck is 420.0
	println(payroll("hourly", 50))            //> Weekly paycheck is 577.5
	println(payroll("salaried", 0))           //> This is a salaried employee
}