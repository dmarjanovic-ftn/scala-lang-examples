package coursera.week00

object PowerSet {

  private def powerset[T](set: List[T]): List[T] = {
    Nil
  }

  def main(args: Array[String]) {
    val s  = List(1, 2, 3, 4)
    val ps = powerset(s)

    println(ps)
  }
}
