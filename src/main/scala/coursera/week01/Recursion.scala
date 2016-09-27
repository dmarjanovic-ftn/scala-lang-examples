package coursera.week01

object Recursion {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

    println("\nParentheses Balancing")
    println(balance("(if (zero? x) max (/ 1 x))".toList))
    println(balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList))
    println(balance(":-)".toList))
    println(balance("())(".toList))

  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (r < 0 || c < 0)
      0
    else if (r == 0 && c == 0)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    var parentheses = 0

    def balanceHlp(chars: List[Char]) : Boolean = {
      if (parentheses < 0)
        false
      else if (chars.isEmpty)
        parentheses == 0
      else {
        if (chars.head == '(')
          parentheses = parentheses + 1
        else if (chars.head == ')')
          parentheses = parentheses - 1

        balanceHlp(chars.tail)
      }
    }

    balanceHlp(chars)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = 0
}
