package _99_scala_problems

object P05 {

  private def reverse[T](list: List[T]): List[T] = {
    if (list == Nil)
      return Nil
    else
      list.last :: reverse(list.init)
  }

  def main(args: Array[String]) {
    println("Problem 05 (*)\n\tReverse a list.")

    val res0 = reverse(List(1, 2, 3, 4, 5, 6, 7, 8))
    println(res0)
  }
}
