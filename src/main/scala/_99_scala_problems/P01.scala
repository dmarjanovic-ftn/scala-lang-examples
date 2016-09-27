package _99_scala_problems

object P01 {

  // Last by Me
  private def myLast[A](list : List[A]) : A =
  if (list.isEmpty)
    throw new ArrayIndexOutOfBoundsException
  else if (list.size == 1)
    list(0)
  else
    myLast(list.tail)

  // Last According to Site
  private def last[A](list: List[A]) : A =
    list match {
      case h :: Nil => h
      case _ :: tail => last(tail)
      case _ => throw new NoSuchElementException
    }

  def main(args: Array[String]) {
    println("Problem 01 (*)\n\tFind the last element of a list.")

    val res0 = last(List(1, 1, 2, 3, 5, 8))
    println(res0)

    val res1 = myLast(List(1, 1, 2, 3, 5, 8, 9, 21))
    println(res1)
  }
}