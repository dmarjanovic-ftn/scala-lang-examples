package _99_scala_problems

object P02 {

  // Solved with Scala Matching
  private def penultimate[A](list: List[A]): A = {
    list match {
      case  head :: _ :: Nil => head
      case  _ :: tail => penultimate(tail)
      case _ => throw new NoSuchElementException
    }
  }

  def main(args: Array[String]): Unit = {
    println("Problem 02 (*)\n\tFind the last but one element of a list.")

    val res0 = penultimate(List(1, 3, 4))
    println(res0)

    val res1 = penultimate(List(3))
    println(res1)

    val res2 = penultimate(List())
    println(res2)
  }
}
