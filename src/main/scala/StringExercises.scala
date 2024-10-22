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

}
