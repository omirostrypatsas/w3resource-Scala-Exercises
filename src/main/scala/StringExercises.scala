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

}
