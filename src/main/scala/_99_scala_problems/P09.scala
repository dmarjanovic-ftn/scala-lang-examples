package _99_scala_problems

object P09 {

  private def pack[T](list: List[T]): List[List[T]] = {
    // TODO
    Nil
  }

  def main(args: Array[String]) {
    println("Problem 09 (**)\n\tPack consecutive duplicates of list elements into sublists.")

    val res0 = pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    println(res0)
  }
}
