object FlowExercises extends App {

  // Exercise 1.

  def numberSign(num: Int): String = {
    if (num > 0) s"$num is positive"
    else if (num < 0) s"$num is negative"
    else s"$num is zero"
  }

  println(numberSign(0))
  println(numberSign(-10))
  println(numberSign(10))

  // Exercise 2.

  def maximum(num1: Int, num2: Int): Int = {
    if (num1 > num2) num1
    else num2
  }

  println(maximum(3, 10))
  println(maximum(29329, 134))
  println(maximum(-3, 0))

  // Exercise 3.

  def evenOrOdd(num: Int): String = {
    if (num % 2 == 0) "Even"
    else "Odd"
  }

  println(evenOrOdd(2))
  println(evenOrOdd(3))

  // Exercise 4.

  def factorial(num: Int): Int = {
    def helper(currentTotal: Int, num: Int): Int = {
      if (num > 1) helper(currentTotal * num, num - 1)
      else currentTotal
    }
    helper(1, num)
  }

  println(factorial(7))
  println(factorial(3))

  // Exercise 5.

  def fibonacci(num: Int): Int = {
    if (num == 0) 0
    else if (num == 1 || num == 2) 1
    else fibonacci(num - 1) + fibonacci(num - 2)
  }

  println(fibonacci(0))
  println(fibonacci(1))
  println(fibonacci(2))
  println(fibonacci(7))
  println(fibonacci(11))
  println(fibonacci(14))

  // Exercise 6.

  def multiplicationTable(num: Int): Unit = {
    def helper(reminder: Int): Unit = {
      if (reminder > 0) {
        println(s"$num * $reminder = " + num * reminder)
        helper(reminder - 1)
      } else {
        println(s"$num * $reminder = " + num * 0)
      }
    }
    println(s"The multiplication table of $num is:")
    helper(num)
  }

  multiplicationTable(3)

  // Exercise 7.

  def summation(array: Array[Int]): Int = {
    var sum: Int = 0
    for (number <- array) {
      sum += number
    }
    sum
  }

  println(summation(Array(1, 2, 3, 4, 5, 6)))
  println(summation(Array(0, 2, 43, 4, -5, 16)))

  // Exercise 8.

  def palindrome(word: String): Boolean = {
    word == word.reverse
  }

  println(palindrome("hello"))
  println(palindrome("noon"))
  println(palindrome("wow"))


  def noOfVowels(word: String): Int = {
    var count: Int = 0
    for (ch <- word) {
      if (isVowel(ch)) {
        count += 1
      }
    }
    count
  }

  def countVowelsMatch(word: String): Int = {
    word.toLowerCase match {
      case "" => 0
      case s  => s.count(isVowel)
    }
  }

  def isVowel(ch: Char): Boolean = {
    ch.toLower match {
      case 'a' | 'e' | 'i' | 'o' | 'u' => true
      case _ => false
    }
  }

  println("Number of voewls is: " + noOfVowels("lol"))
  println("Number of voewls is: " + noOfVowels("scala"))
  println("Number of voewls is: " + noOfVowels("programming"))
  println("Number of voewls is: " + noOfVowels("brb"))
}
