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
    if ((num >= 100 && num <= 120) || (num <= 300 && num >= 280)) true
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
    val len: Int = word.length
    if (len <= 1) word
    else word(len - 1) + word.drop(1).init + word(0)
  }

  println(lettersSwap("hello"))
  println(lettersSwap("Omiros"))
  println(lettersSwap(""))
  println(lettersSwap("p"))

  def lettersSwapVol2(word: String): String = {
    val len: Int = word.length
    if (len <= 1) word
    else word(len - 1) + word.substring(1, len - 1) + word(0)
  }

  println(lettersSwapVol2("hello"))
  println(lettersSwapVol2("Omiros"))
  println(lettersSwapVol2(""))
  println(lettersSwapVol2("p"))

  // Exercise 9.

  def copyMethod(word: String): String = {
    if (word.length <= 2) {
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
    val len: Int = word.length
    if (len <= 0) word
    else word(len - 1) + word.drop(0) + word(len - 1)
  }

  println(lastChar("ifword"))
  println(lastChar("hello"))
  println(lastChar(""))
  println(lastChar("e"))

  // Exercise 11.

  def dividedBy3or7(num: Int): Boolean = {
    if ((num % 3 ==0) || (num%7 == 0)) true
    else false
  }

  println(dividedBy3or7(33))
  println(dividedBy3or7(35))
  println(dividedBy3or7(21))
  println(dividedBy3or7(46))

  // Exercise 12.

  def threeCharacterManipulator(word: String): String = {
    val len: Int = word.length
    if (len < 3) {
      word
    } else {
      val first3characters: String = word.substring(0,3)
      first3characters + word + first3characters
    }
  }

  println(threeCharacterManipulator("ifword"))
  println(threeCharacterManipulator("hello"))
  println(threeCharacterManipulator(" "))
  println(threeCharacterManipulator("e"))

  // Exercise 13.

  def wordStartsWith(word: String): Boolean = {
    word.startsWith("Sc")
  }

  println(wordStartsWith("ifword"))
  println(wordStartsWith("Scala"))

  // Exercise 14.

  def temperatureChecker(temp1: Double, temp2: Double): Boolean = {
    if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) true
    else false
  }

  println(temperatureChecker(10, 30))
  println(temperatureChecker(0, 101))
  println(temperatureChecker(-5.5, 30))
  println(temperatureChecker(-15, 111.11))
  println(temperatureChecker(200.35, -20.58))

  // Exercise 15.

  def numberChecker(int1: Int, int2: Int): Boolean = {
    if ((int1 >= 100 && int1 <= 200) || (int2 >= 100 && int2 <= 200)) true
    else false
  }

  println(numberChecker(20, 30))
  println(numberChecker(120, 30))
  println(numberChecker(20, 130))
  println(numberChecker(120, 130))

  // Exercise 16.

  def numberCheckerVol2(int1: Int, int2: Int, int3: Int): Boolean = {
    if ((int1 >= 20 && int1 <= 50) || (int2 >= 20 && int2 <= 50) || (int3 >= 20 && int3 <= 50)) true
    else false
  }

  println(numberCheckerVol2(10, 300, 150))
  println(numberCheckerVol2(10, 30, 60))
  println(numberCheckerVol2(40, 2, 89))
  println(numberCheckerVol2(1, 3, 43))

  // Exercise 17.

  def numberCheckerVol3(int1: Int, int2: Int): Boolean = {
    if ((int1 <= 20 || int2 >= 50) || (int2 <= 20 || int1 >= 50)) true
    else false
  }

  println(numberCheckerVol3(20, 84))
  println(numberCheckerVol3(14, 50))
  println(numberCheckerVol3(11, 45))
  println(numberCheckerVol3(25, 40))

  // Exercise 18.

  def ytChecker(word: String): String = {
    if (word.drop(1).startsWith("yt")) word(0) + word.drop(2)
    else word
  }

  println(ytChecker("byte"))
  println(ytChecker("Scala"))

  // Exercise 19.

  def largerNumber(no1: Int, no2: Int, no3: Int): Int = {
    List(no1, no2, no3).max
  }

  println(largerNumber(10, 300, 150))
  println(largerNumber(10, 30, 6))
  println(largerNumber(40, 2, 8))

  // Exercise 20.

  def distanceCalc(no1: Int, no2: Int): Int = {
    val no1distance: Int = (no1 - 100).abs
    val no2distance: Int = (no2 - 100).abs
    if (no1distance < no2distance) {
      no1
    } else if (no2distance < no1distance) {
      no2
    } else {
      0
    }
  }

  println(distanceCalc(20, 120))
  println(distanceCalc(120, 120))
  println(distanceCalc(120, 20))

  // Exercise 21.

  def intervalChecker(no1: Int, no2: Int): Boolean = {
    List(no1, no2).forall{n => n >= 40 && n<= 50} || List(no1, no2).forall{n => n >= 50 && n <= 60}
  }

  println(intervalChecker(20, 120))
  println(intervalChecker(40, 50))
  println(intervalChecker(50, 55))
  println(intervalChecker(50, 30))
  println(intervalChecker(20, 55))

  // Exercise 22.

  def intervalChecker2(no1: Int, no2: Int): Int = {
    if ((no1 < 20 || no1 > 30) && (no2 < 20 || no2 > 30)) 0
    else if ((no1 >= 20 && no1 <= 30) && (no2 < 20 || no2 > 30)) no1
    else if ((no1 < 20 || no1 > 30) && (no2 >= 20 && no2 <= 30)) no2
    else  {
      List(no1, no2).max
    }
  }

  println(intervalChecker2(20, 120))
  println(intervalChecker2(40, 30))
  println(intervalChecker2(23, 27))
  println(intervalChecker2(25, 21))

  def intervalChecker3(no1: Int, no2: Int): Int = {
    val maxChecker: Int = List(no1, no2).max
    if (maxChecker >= 20 && maxChecker <= 30) maxChecker
    else 0
  }

  println(intervalChecker3(20, 120))
  println(intervalChecker3(40, 30))
  println(intervalChecker3(23, 27))
  println(intervalChecker3(25, 21))

  // Exercise 23.

  def stringEncounter(word: String): Boolean = {
    val numOfEncounters: Int = word.count(n => n == 'o')
    numOfEncounters >= 2 && numOfEncounters <= 4
  }

  println(stringEncounter("Omiros"))
  println(stringEncounter("omiros"))
  println(stringEncounter("gooooal"))
  println(stringEncounter("AAAAAA"))
  println(stringEncounter("coolio"))
  println(stringEncounter("gooooal"))

  // Exercise 24.
  println("Exercise 24")

  def lastDigitCheck(num1: Int, num2: Int): Boolean = {
    (num1 % 10) == (num2 % 10)
  }

  println(lastDigitCheck(23, 30))
  println(lastDigitCheck(40, 30))
  println(lastDigitCheck(3, 3))
  println(lastDigitCheck(2, 7))
  println(lastDigitCheck(112, 734))

  // Exercise 25.

  def upperCase(word: String): String = {
    val len: Int = word.length
    if (len < 4) word.toUpperCase
    else word.take(len -4) + word.drop(len -4).toUpperCase
  }

  println(upperCase("hey"))
  println(upperCase("scala"))
  println(upperCase("alright"))

  // Exercise 26.

  def copyFunction(word: String, n: Int): String = {
    word.repeat(n)
  }

  println(copyFunction("hey", 2))
  println(copyFunction("scala", 3))
  println(copyFunction("hey", 0))
  println(copyFunction("scala", 1))

}
