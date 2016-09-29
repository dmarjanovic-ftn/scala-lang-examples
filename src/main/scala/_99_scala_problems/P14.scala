package _99_scala_problems

object P14 {

  private def duplicate[T](list: List[T]): List[T] = {
    list.flatMap(e => List(e, e))
  }

  def main(args: Array[String]) {
    println("Problem 14 (*)\n\tDuplicate the elements of a list.")

    val res0 = duplicate(List('a, 'b, 'c, 'c, 'd))
    println(res0)
  }
}
