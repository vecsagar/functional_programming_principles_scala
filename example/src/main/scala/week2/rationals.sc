package week2

object rationals {
  val x = new Rational(1, 3)                      //> x  : week2.Rational = week2.Rational@1011dc21
  val y = new Rational(5, 7)                      //> y  : week2.Rational = week2.Rational@5c49d589
  val z = new Rational(3, 2)                      //> z  : week2.Rational = week2.Rational@736244b4
  
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  
}

class Rational(x: Int, y: Int) {
	def numer = x
	def denom = y
	
	def add(that: Rational) =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
	
	def neg: Rational = new Rational(-numer, denom)
}