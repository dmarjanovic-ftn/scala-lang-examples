package _99_scala_problems.arithmetic {

  class S99Int(val start: Int) {
    import S99Int._

    // P31 (**) Determine whether a given integer number is prime.
    def isPrime(): Boolean = true


  }

  object S99Int {
    implicit def int2S99Int(i: Int): S99Int = new S99Int(i)

    def apply(number: Int) = new S99Int(number)

    // P32 (**) Determine the greatest common divisor of two positive integer numbers.
    def gcd(m: Int, n: Int): Int = if (n == 0) m else gcd(n, m % n)
  }

  object App {
    def main(args: Array[String]) = {
      println("Hello, Arithmetic!")

      val number = S99Int(7)

      val res0 = number.isPrime()
      println(res0)

      println(S99Int.gcd(36, 63))
    }
  }
}
