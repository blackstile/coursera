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
      if (c == 0 || r == 0 || c >= r) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      isBalanced(chars, 0) == 0
    }

  def isBalanced(chars: List[Char], open:Int) : Int ={
            if (chars.isEmpty) open
            else  {
              if (chars.head == '(' && open >= 0) isBalanced(chars.tail, open + 1)
              else if (chars.head == ')' ) isBalanced(chars.tail, open - 1)
              else isBalanced(chars.tail, open)
            }
  }

  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      def count(m: Int, c: List[Int]): Int = {
        if (c.isEmpty) 0
        else if (m - c.head == 0) 1
        else if (m - c.head < 0) 0
        else countChange(m - c.head, c) + countChange(m, c.tail)
      }
      count(money, coins.sorted)
    }
  }
