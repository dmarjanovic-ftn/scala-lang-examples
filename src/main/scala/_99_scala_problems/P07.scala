package _99_scala_problems

object P07 {

  private def flatten[T](list: List[T]): List[T] = {
    if (list.isEmpty)
      Nil
    else {
      list.head match {
        case e: List[T] => flatten(e) ::: flatten(list.tail)
        case e: T => e :: flatten(list.tail)
        case _ => Nil
      }
    }
  }

  def main(args: Array[String]) {
    println("Problem 07 (**)\n\tFlatten a nested list structure.")

    val res0 = flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    println(res0)
  }
}
