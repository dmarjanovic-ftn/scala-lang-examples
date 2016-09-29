package _99_scala_problems

object P08 {

  private def compress(list: List[Any]): List[Any] = {
    list match {
      case a :: Nil => a :: Nil
      case a :: b :: _=> {
        if (a == b)
          compress(list.tail)
        else
          a :: compress(list.tail)
      }
    }
  }

  def main(args: Array[String]) {
    println("Problem 08 (**)\n\tEliminate consecutive duplicates of list elements.")

    val res0 = compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    println(res0)
  }
}
