package _99_scala_problems

object P06 {

  private def isPalindrome[T](list: List[T]): Boolean = {
    list match {
      case Nil => true
      case _ :: Nil => true
      case a :: b :: Nil => a == b
      case head :: tail => head == tail.last && isPalindrome(tail.init)
    }
  }

  def main(args: Array[String]) {
    println("Problem 06 (*)\n\tFind out whether a list is a palindrome.")

    val res0 = isPalindrome(List(1, 2, 3, 4, 5, 4, 3, 2, 1))
    println(res0)

    val res1 = isPalindrome(List(1, 2, 3, 4, 4, 3, 2, 1))
    println(res1)

    val res3 = isPalindrome(List(1))
    println(res3)

    val res4 = isPalindrome(List())
    println(res4)

    val res5 = isPalindrome(List('s', 'e', 'r', 'g', 'i', 'o'))
    println(res5)

    val res6 = isPalindrome(List("r", "a", "m", "o", "s"))
    println(res6)
  }
}
