package classes

class Rational(num: Int, den: Int) {

  // Denominator can't be zero
  require(den != 0)

  // Calculate greatest common divisor
  private val g = gcd(num.abs, den.abs)

  val numerator : Int = num / g
  val denominator : Int = den / g

  def +(that: Rational): Rational =
    new Rational(numerator * that.denominator + that.numerator * denominator, denominator * that.denominator)

  // Method overriding
  override def toString: String =
    numerator +"/"+ denominator

  // Greatest common divisor
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
