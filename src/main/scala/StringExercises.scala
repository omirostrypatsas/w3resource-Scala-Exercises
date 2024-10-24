object StringExercises extends App {

  // Exercise 1.

  def characterAndLength(string: String, index: Int): Unit = {
    val character: Char = string(index)
    println(s"The character at posiiton $index is $character")
    println(s"Length of the string: ${string.length}")
  }

  characterAndLength("hello", 2)

  // Exercise 2.

  def unicodeChar(string: String, index: Int): Unit = {
    val unicodeCharacter: Int = string.codePointAt(index)
    println(s"Character (unicode point) = $unicodeCharacter")
  }

  unicodeChar("hello", 2)
  unicodeChar("w3resource - Scala", 1)
  unicodeChar("w3resource - Scala", 9)

  // Exercise 3.

  def lexicography(string1: String, string2: String): Unit = {
    val result: Int = string1.compareTo(string2)
    if (result == 0) println(s"$string1 is equal to $string2")
    else if(result < 0) println(s"$string1 is less than $string2")
    else println(s"$string1 is greater than $string2")
  }

  lexicography("This is Exercise 1", "This is Exercise 2")
  lexicography("This is Exercise 1", "This is Exercise 1")
  lexicography("This is Blacky", "This is Black")

  // Exercise 4.

  def stringConcatenation(string1: String, string2: String): Unit = {
    println("Original Strings:")
    println(s"String 1: $string1")
    println(s"String 2: $string2")
    println(s"The concatenated string: ${string1 + string2}")
  }

  stringConcatenation("Scala Exercises and ", "Python Exercises")

  // Exercise 5.

  def isStringContained(string1: String, string2: String): Unit = {
    println(s"Original String: $string1")
    println(s"Specified sequence of char values: $string2")
    println("Test if the said string contains the specified sequence of char values!")
    if(string1.contains(string2)) {
      println("true")
    } else {
      println("false")
    }
  }

  isStringContained("Scala Exercises and Python Exercises", "and")
  isStringContained("Scala Exercises and PHP Exercises", "Python")

  // Exercise 6.

  def stringFromArray(characterArray: Array[Char], index: Int, length: Int): Unit = {
    val newString: String = String.copyValueOf(characterArray, index, length)
    println("The book contains " + newString + " pages")
  }

  stringFromArray(Array('1', '2', '3', '4', '5', '6'), 2, 3)

  // Exercise 7.

  def stringEnds(string1: String, string2: String): Unit = {
    println(s"'$string1' ends with '$string2'? ${string1.endsWith(string2)}")
  }

  stringEnds("Python Exercises", "se")
  stringEnds("Python Exercise", "se")

  // Exercise 8.

  def isStringEqual(string1: String, string2: String): Unit = {
    println(s"'$string1' equals '$string2'? ${string1.equals(string2)}")
  }

  isStringEqual("Stephen Edwin King", "Stephen Edwin  King")
  isStringEqual("Stephen Edwin King", "Stephen Edwin King")

  // Exercise 9.

  def isStringEqualIgnoringCase(string1: String, string2: String): Unit = {
    println(s"'$string1' equals '$string2'? ${string1.toLowerCase.equals(string2.toLowerCase)}")
  }

  isStringEqualIgnoringCase("Stephen Edwin King", "Stephen Edwin  King")
  isStringEqualIgnoringCase("Stephen Edwin King", "Stephen edwin king")

  // Exercise 10.

  def charReplace(string: String, oldChar: String, newChar: String): Unit = {
    println(s"Original string: $string")
    println(s"New String: ${string.replace(oldChar, newChar)}")
  }

  charReplace("The quick brown fox jumps over the lazy dog.", "d", "f")

  // Exercise 11.

  def createSubstring(string: String, startPosition: Int, endPosition: Int): Unit = {
    println(s"Original = $string")
    println(s"From said string, substring between two positions ($startPosition, $endPosition) = ${string.substring(startPosition, endPosition)}")
  }

  createSubstring("The quick brown fox jumps over the lazy dog.", 10, 26)

  // Exercise 12.

  def lowerAndUpperCase(string: String): Unit = {
    println(s"Original String: ${string}")
    println(s"String in lower case: ${string.toLowerCase}")
    println(s"String in uppercase: ${string.toUpperCase}")
  }

  lowerAndUpperCase("The Quick BroWn FoX!")

  // Exercise 13.

  def trimmer(string: String): Unit = {
    println(s"Original String:-$string")
    println(s"New String:${string.trim}")
  }

  trimmer(" Scala Exercises")
  trimmer("Scala Exercises ")
  trimmer(" Scala Exercises ")
  trimmer("Scala Exercises")

  // Exercise 15.

  def maxChar(string: String): Unit = {
    println(s"The given string is: $string")
    println(s"Maximum occurring character of the said string is: ${string.max}")
  }

  maxChar("test string")
  maxChar("Scala")

  // Exercise 18.

  def rotations(string1: String, string2: String): Unit = {
    println(s"The given strings are: $string1 and $string2")
    val string1twice: String = string1 + string2
    println(s"The concatination of 1st string twice is: $string1twice")
    if (string1twice.contains(string2)) println(s"The second string $string2 exists in the new string.\n Strings are rotations of each other")
    else println(s"The second string $string2 doesn't exist in the new string.\n Strings are not rotations of each other")
  }

  rotations("ABACD", "CDABA")

  // Exercise 19.

  def stringConcat(string1: String, string2: String): Unit = {
    println(s"The given strings are: $string1 and $string2")
    if (string1(string1.length - 1) == string2(0)) {
      val concatStringWithoutDuplicate: String = string1.substring(0, string1.length - 1).appendedAll(string2)
      println(s"The string after concatination is: $concatStringWithoutDuplicate")
    } else {
      println(s"The string after concatination is: ${string1 + string2}")
    }
  }

  stringConcat("food", "door")
  stringConcat("dog", "food")

  // Exercise 20.

  def reverseLastTwoChars(string: String): Unit = {
    println(s"The given string is: $string")
    if (string.length >= 2) {
      val newString: String = string.substring(0, string.length - 2) + string.substring(string.length - 2, string.length).reverse
      println(s"The string after swap last two characters are: $newString")
    } else {
      println(s"The string $string is less than 2 characters")
    }
  }

  reverseLastTwoChars("Scala")
  reverseLastTwoChars("Hi")
  reverseLastTwoChars("d")

  // Exercise 21.

  def twoLastCharsCheck(string1: String, string2: String): Unit = {
    println(s"The given string is: $string1")
    if (string2.length == 2) {
      if (string1.endsWith(string2)) println(s"The string containing ng at last: true")
      else println(s"The string containing ng at last: false")
    } else {
      println("The string is not of length 2")
    }
  }

  twoLastCharsCheck("String", "ng")
  twoLastCharsCheck("String", "gn")

  // Exercise 22.

  def appendTwoStrings(string1: String, string2: String): Unit = {
    println(s"The given strings are: $string1 and $string2")
    val difference: Int =  string1.length - string2.length
    if (difference == 0) {
      println(s"The new string is: ${string1 + string2}")
    }
    else if (difference > 0) {
      val appendedString1: String = string1.substring(difference) + string2
      println(s"The new string is: $appendedString1")
    } else {
      val appendedString2: String = string1 + string2.substring(-difference)
      println(s"The new string is: $appendedString2")
    }
  }

  appendTwoStrings("Welcome", "home")
  appendTwoStrings("Scala", "Python")

  // Exercise 23.

  def firstAndLastChars(string: String, num: Int): Unit = {
    println(s"The given strings is: $string")
    println(s"The given numbers is: $num")
    if (num * 2 > string.length + 1) {
      println("The given string cannot be modified")
    } else {
      val newString: String = string.substring(0, num) + string.substring(string.length - num)
      println(s"The new string is: $newString")
    }
  }

  firstAndLastChars("Welcome", 3)
  firstAndLastChars("Scala programming", 4)

}
