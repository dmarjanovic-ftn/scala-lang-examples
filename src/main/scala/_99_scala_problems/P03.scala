package _99_scala_problems

object P03 {

  private def nth[T](n: Int, list: List[T]): T = {
    if (list == Nil)
      throw new NoSuchElementException
    else if (n == 0)
      list(0)
    else
      nth(n-1, list.tail)
  }

  def main(args: Array[String]) {
    println("Problem 03 (*)\n\tFind the Kth element of a list.")

    val res0 = nth(3, List(1, 1, 2, 3, 5, 8))
    println(res0)
  }
}
