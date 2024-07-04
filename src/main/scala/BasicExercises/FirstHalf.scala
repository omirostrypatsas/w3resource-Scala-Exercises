package BasicExercises

object FirstHalf extends App{

  // Exercise 1.

  println("Hello, world")
  println("Scala language: " + util.Properties.versionString)

  // Exercise 2.

  def sum(num1: Int, num2: Int): Int = {
    if (num1 == num2) 3*(num1 + num2)
    else num1 + num2
  }

  println(sum(1,3))
  println(sum(2,2))

  // Exercise 3.

  def absoluteDifference(number: Int): Int = {
    val absDiff: Int = number - 51
    if (absDiff > 0) number * 3
    else absDiff.abs
  }

  println(absoluteDifference(52))
  println(absoluteDifference(50))

  // Exercise 4.

  def checker(no1: Int, no2: Int): Boolean = {
    if ((no1 == 30) || (no2 == 30) || (no1 + no2 == 30)) true
    else false
  }

  println(checker(30, 35))
  println(checker(40, 30))
  println(checker(20, 10))
  println(checker(5, 3))

  // Exercise 5.

  def checkerVol2(num: Int): Boolean = {
    if ((num >= 100 & num <= 120) || (num <= 300 & num >= 280)) true
    else false
  }

  println(checkerVol2(285))
  println(checkerVol2(110))
  println(checkerVol2(200))

  // Exercise 6.

  def stringChecker(word: String): String = {
    if (word.startsWith("if")) word
    else "if" + word
  }

  println(stringChecker("ifword"))
  println(stringChecker("hello"))

  // Exercise 7.

  def characterRemoval(word: String, position: Int): String = {
    word.take(position) + word.drop(position + 1)
  }

  println(characterRemoval("hello", 3))
  println(characterRemoval("hello", 0))
  println(characterRemoval("hello", 4))

  // Exercise 8.

  def lettersSwap(word: String): String = {
    val len: Int = word.size
    if (len <= 1) word
    else word(len - 1) + word.drop(1).init + word(0)
  }

  println(lettersSwap("hello"))
  println(lettersSwap("Omiros"))
  println(lettersSwap(""))
  println(lettersSwap("p"))

  def lettersSwapVol2(word: String): String = {
    val len: Int = word.size
    if (len <= 1) word
    else word(len - 1) + word.substring(1, len - 1) + word(0)
  }

  println(lettersSwapVol2("hello"))
  println(lettersSwapVol2("Omiros"))
  println(lettersSwapVol2(""))
  println(lettersSwapVol2("p"))

  // Exercise 9.

  def copyMethod(word: String): String = {
    if (word.size <= 2) {
      word
    } else {
      val first2characters: String = word.substring(0, 2)
      first2characters * 4
    }
  }

  println(copyMethod("hello"))
  println(copyMethod("example"))

  // Exercise 10.

  def lastChar(word: String): String = {
    val len: Int = word.size
    if (len <= 0) word
    else word(len - 1) + word.drop(0) + word(len - 1)
  }

  println(lastChar("ifword"))
  println(lastChar("hello"))
  println(lastChar(""))
  println(lastChar("e"))

}
