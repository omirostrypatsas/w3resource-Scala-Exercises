object FunctionsAndMethods extends App {

  def factorial(no: Int): Int = {
    if(no == 0) 1
    else no * factorial(no - 1)
  }

  println(factorial(3))
  println(factorial(5))

  def isPrime(no: Int): Boolean = {
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

  def reverseString(word: String): String = {
    word.reverse
  }

  println(reverseString("hello"))
  println(reverseString("omg"))
  println(reverseString("Scala"))

}
