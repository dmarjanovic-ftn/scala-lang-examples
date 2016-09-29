package _99_scala_problems

object P15 {

  private def makeElems[T](n: Int, elem: T): List[T] = {
    if (n == 0)
      return Nil
    elem :: makeElems(n-1, elem)
  }

  private def duplicateN[T](n: Int, list: List[T]): List[T] = list.flatMap(e => makeElems(n, e))

  def main(args: Array[String]) {
    println("Problem 15 (**)\n\tDuplicate the elements of a list a given number of times.")

    val res0 = duplicateN(5, List('a, 'b, 'c, 'c, 'd))
    println(res0)
  }
}
