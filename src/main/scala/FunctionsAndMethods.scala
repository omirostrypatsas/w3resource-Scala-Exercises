import scala.annotation.tailrec

object FunctionsAndMethods extends App {

  // Exercise 1

  def factorial(no: Int): Int = {
    if(no == 0) 1
    else no * factorial(no - 1)
  }

  println(factorial(3))
  println(factorial(5))

  // Exercise 2

  def isPrime(no: Int): Boolean = {
    @tailrec
    def calc(divider: Int): Boolean = {
      if(no <= 1) false
      else if(divider <= 1) true
      else if(divider > 1 && no % divider == 0) false
      else calc(divider - 1)
    }
    calc(no - 1)
  }

  println(isPrime(3))
  println(isPrime(10))
  println(isPrime(11))
  println(isPrime(1))
  println(isPrime(2))

  // Exercise 4

  def reverseString(word: String): String = {
    word.reverse
  }

  println(reverseString("hello"))
  println(reverseString("omg"))
  println(reverseString("Scala"))

  // Exercise 5

  def palindrome(word: String): Boolean = {
    word == word.reverse
  }

  println(palindrome("hello"))
  println(palindrome("lol"))

  // Exercise 6

  def maxElement(array: Array[Int]): Int = {
    array.max
  }

  println(maxElement(Array(1,2,3,4,4,5,1,122,11,10293)))
  println(maxElement(Array(3488,3849,82, 2, 249, 3003, 458)))

  // Exercise 7

  def numToAPower(num: Int, power: Int): Int = {
    if (power == 0) 1
    else num * numToAPower(num, power -1)
  }

  println(numToAPower(3,2))
  println(numToAPower(2,5))

  // Exercise 8

  def isEven(num: Int): Boolean = num % 2 == 0

  println(isEven(88))
  println(isEven(7))

  // Exercise 9

  def isPerfectSquare(num: Int): Boolean = {
    @tailrec
    def calculator(dividedBy: Int): Boolean = {
      if(dividedBy == 0) {
        false
      } else {
        if (num / dividedBy == dividedBy) true
        else calculator(dividedBy - 1)
      }
    }
    calculator(num)
  }

  println(isPerfectSquare(7))
  println(isPerfectSquare(9))
  println(isPerfectSquare(1))
  println(isPerfectSquare(0))


  def isSorted(list: List[Int])(implicit ord: Ordering[Int]): Boolean = {
    list.sliding(2).forall { case List(a, b) => ord.lteq(a, b) }
  }

  println(isSorted(List(1, 2, 3, 4, 5, 6)))
  println(isSorted(List(4, 2, 5, 1, 6, 3)))

}
