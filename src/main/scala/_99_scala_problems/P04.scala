package _99_scala_problems

object P04 {

  private def length[T](list: List[T]): Int = {
    list match {
      case Nil => 0
      case _ :: tail => 1 + length(tail)
    }
  }

  def main(args: Array[String]) {
    println("Problem 04 (*)\n\tFind the number of elements of a list.")

    val res0 = length(List(1, 4, 22, 12, 7, 8, 20))
    println(res0)
  }
}
