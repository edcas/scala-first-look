package coursera

object rationals {
  val x = new Rational(1, 3)                      //> x  : coursera.Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : coursera.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : coursera.Rational = 3/2
  
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  x.add(y)                                        //> res2: coursera.Rational = 22/21
  x.sub(y).sub(z)                                 //> res3: coursera.Rational = -79/42
 
}

class Rational(x: Int, y:Int) {
	def numer = x
	def denom = y
	
	def add(that:Rational): Rational =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom
	 	)
	 
	def neg: Rational = new Rational(-numer, denom)
	
	def sub(that: Rational) = add(that.neg)
 	
 	override def toString = numer + "/" + denom
}