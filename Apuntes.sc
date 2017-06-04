/* ASSIGNMET 1.2 WEEK - 1*/

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
def pascal(c: Int, r: Int): Int =
  if (c == 0 || c == r) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)


/**
  * Exercise 2
  */
def balance(chars: List[Char]): Boolean = {
  def revisar(ch: List[Char], cx: Int): Int =
    if (ch.isEmpty) cx
    else if (ch.head == '(') revisar(ch.tail, cx + 1)
    else if (ch.head == ')' && cx > 0) revisar(ch.tail, cx - 1)
    else revisar(ch.tail, cx)
  if (chars.count(_.equals('(')) == chars.count(_.equals(')'))) revisar(chars, 0) == 0 else false
}

/**
  * Exercise 3
  */
def countChange(money: Int, coins: List[Int]): Int =
  if(money == 0) 1
  else if(money > 0 && !coins.isEmpty)
    countChange(money - coins.head, coins) + countChange(money, coins.tail)
  else 0
