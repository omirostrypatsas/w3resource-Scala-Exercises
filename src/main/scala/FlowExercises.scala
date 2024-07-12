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
//
//  def fibonacci(num: Int): Int = {
//
//  }

}
