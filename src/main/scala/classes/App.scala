package classes

object App {
  def main(args: Array[String]) {
    val a: Rational = new Rational(3,3)
    val b: Rational = new Rational(4,5)

    println(a + b)
  }
}
