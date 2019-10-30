object objects {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  case class Employee(lName: String, fName: String, ID: Int) {
  		override def toString:String = {
  			s"Employeed ID: $ID, Full Name: $fName $lName"
  		}
  }
  
  var employees = List(
  	Employee("Smith", "John", 1234),
  	Employee("Simpson", "Scott", 5678),
  )                                               //> employees  : List[objects.Employee] = List(Employeed ID: 1234, Full Name: Jo
                                                  //| hn Smith, Employeed ID: 5678, Full Name: Scott Simpson)
  
  employees.foreach(println)                      //> Employeed ID: 1234, Full Name: John Smith
                                                  //| Employeed ID: 5678, Full Name: Scott Simpson
	var employee = Employee("Rogers", "Samanthan", 1575)
                                                  //> employee  : objects.Employee = Employeed ID: 1575, Full Name: Samanthan Roge
                                                  //| rs
}