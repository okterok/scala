*/ Week one
*/

package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || r == c) 1
      else if (c < 0 || r < 1) 0
      else pascal(c-1, r-1) + pascal(c, r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def parenBalance(chars: List[Char], parenDepth: Int): Boolean = {
        if (chars.isEmpty) parenDepth == 0
        else if (chars.head == ')' && parenDepth == 0) return false
        else if (chars.head == '(') parenBalance(chars.tail, parenDepth - 1)
        else if (chars.head == ')') parenBalance(chars.tail, parenDepth + 1)
        else parenBalance(chars.tail, parenDepth)
      }
      parenBalance(chars, 0)
    }
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int ={
      if (money == 0) 1
      else if (money < 0) 0
      else if (coins.isEmpty) 0
      else if (coins.head < 0) 0
      else  countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
  }
