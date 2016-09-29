package coursera.week00

object Permutations {

  def permutations[T](pref: List[T], list: List[T]): Unit = {
    if (list == Nil) println(pref mkString("") reverse)

    list.map(elem => {
      permutations(pref.::(elem), list.filter(x => x != elem))
    })
  }

  def main(args: Array[String]) {
    val list = List(1, 2, 3, 4)

    permutations(List(), list)
  }

}
