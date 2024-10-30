import scala.annotation.tailrec

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

  // Exercises 24.

  def twoFirstAndLastCharChecks(string: String): Boolean = {
    println(s"The given strings is: $string")
    val len: Int = string.length
    if (len < 2) false
    else if (string.substring(0, 2) == string.substring(len -2, len)) true
    else false
  }

  println("If first two characters appear in the last! " + twoFirstAndLastCharChecks("educated"))
  println("If first two characters appear in the last! " + twoFirstAndLastCharChecks("ABCDEFBA"))

  // Exercise 25.

  def firstAndLastChars(string: String): Unit = {
    println(s"The given strings is: $string")
    val len: Int = string.length
    if (len <= 0) println("String cannot be checked")
    else if (string.charAt(0) == string.charAt(len - 1)) println(s"The new string is: ${string.substring(1, len -1)}")
    else println(s"The new string is: $string")
  }

  firstAndLastChars("testcricket")
  firstAndLastChars("Scala")

  // Exercise 26.

  def firstTwoCharsCheck(string: String): Unit = {
    println(s"The given strings is: $string")
    val len: Int = string.length
    if (len < 2) println("String cannot be checked")
    else {
      if (string.startsWith("gh")) {
        println(s"The new string is: $string")
      } else if (string(1).toString == "h") {
        println(s"The new string is: ${string.substring(1)}")
      } else if (string.startsWith("g")) {
        println(s"The new string is: ${string.charAt(0) + string.substring(2)}")
      } else {
        println(s"The new string is: ${string.substring(2)}")
      }
    }
  }

  firstTwoCharsCheck("ghost")
  firstTwoCharsCheck("photo")
  firstTwoCharsCheck("goat")
  firstTwoCharsCheck("Scala")

  // Exercise 27.

  def charRemoval(string: String, char: Char): Unit = {
    println(s"The given strings is: $string, specified character is: $char")
    val len: Int = string.length
    if (len < 2) println("String cannot be checked")
    else {
      if (char == string.charAt(0) || char == string.charAt(1)) {
        println(s"The new string is: ${string.replaceAll(char.toString, "")}")
      } else {
        println(s"The new string is: $string")
      }
    }
  }

  charRemoval("aacyte", "a".charAt(0))
  charRemoval("bacyte", "a".charAt(0))
  charRemoval("bbacyte", "a".charAt(0))

  // Exercise 29.

  def stringsExistsAtTheEnd(string1: String, string2: String): Boolean = {
    println(s"The given strings are: $string1 and $string2")
    val string1len: Int = string1.length
    val string2len: Int = string2.length
    if (string1len <= 0 || string2len <= 0) {
      false
    } else if (string1.contains(string2) && (string1.substring(string1len - string2len) == string2)) {
        true
    } else {
      false
    }
  }

  println("Is one string appears at the end of other? " + stringsExistsAtTheEnd("pqrxyz", "xyz"))
  println("Is one string appears at the end of other? " + stringsExistsAtTheEnd("pqrxyz", "rxy"))
  println("Is one string appears at the end of other? " + stringsExistsAtTheEnd("xyzpqr", "rxy"))

  // Exercise 34.

  def addStringsAndRepeat(string1: String, string2: String, num: Int): String = {
    println(s"The given strings are: $string1 and $string2")
    @tailrec
    def stringConcat(new_word: String, repeat: Int): String = {
      if (repeat == 0) new_word
      else stringConcat(new_word + string1 + string2, repeat - 1)
    }
    if (num >= 1) stringConcat(string1 + string2, num - 1)
    else "None"
  }

  println("The new string is: " + addStringsAndRepeat("try", "best", 3))
  println("The new string is: " + addStringsAndRepeat("try", "best", 0))
  println("The new string is: " + addStringsAndRepeat("try", "best", 1))

  // Exercise 35.

  def substringRep(string: String, noOfChars: Int, noOfRepetition: Int): String = {
    println(s"The given strings is: $string")
    if (noOfChars <= 0 || noOfRepetition <= 0) "Could not repeat the characters"
    else {
      val len: Int = string.length
      val substring: String = string.substring(len - noOfChars)
      @tailrec
      def stringConcat(new_word: String, repeat: Int): String = {
        if (repeat == 0) new_word
        else stringConcat(new_word + substring, repeat - 1)
      }
      stringConcat(substring, noOfRepetition - 1)
    }
  }

  println("The new string after repetition: " + substringRep("string", 3, 3))
  println("The new string after repetition: " + substringRep("string", 0, 3))
  println("The new string after repetition: " + substringRep("string", 3, 0))

  // Exercise 37.

  def beforeAndAfterChar(string: String, char: Char): Boolean = {
    println(s"The given strings is: $string, specified character is: $char")
    val len: Int = string.length
    var found: Boolean = true
    if (len < 3 || !char.isValidChar) false
    else {
      for (i <- 1 until len - 1) {
        if (string(i) == char) {
          if (string(i - 1) == string(i + 1)) {
            found = true
          } else {
            found = false
          }
        }
      }
      found
    }
  }

  println("The before and after # both characters are same in the said string: " + beforeAndAfterChar("moon#night", '#'))
  println("The before and after # both characters are same in the said string: " + beforeAndAfterChar("bat#$#ball", '$'))
  println("The before and after # both characters are same in the said string: " + beforeAndAfterChar("bat#$ball", '$'))

  // Exercise 39.

  def everyCharDouble(string: String): String = {
    println(s"The given strings is: $string")
    val len: Int = string.length
    @tailrec
    def acc(string: String, new_word: String, charPosition: Int): String = {
      if (charPosition == len) new_word
      else acc(string, new_word + string(charPosition) + string(charPosition), charPosition + 1)
    }
    acc(string, "", 0)
  }

  println("The new string is: " + everyCharDouble("welcome"))

  // Exercise 40.

  def mixedStrings(string1: String, string2: String): String = {
    println(s"The given strings are: $string1 and $string2")
    val len1: Int = string1.length
    val len2: Int = string2.length
    var new_string: String = ""
    if (len1 < len2) {
      for (i <- 0 until len1) {
        new_string = new_string + string1(i) + string2(i)
      }
      for (j <- len1 until len2) {
        new_string = new_string + string2(j)
      }
    } else {
      for (i <- 0 until len2) {
        new_string = new_string + string1(i) + string2(i)
      }
      for (j <- len2 until len1) {
        new_string = new_string + string2(j)
      }
    }
    new_string
  }

  println("The new string is: " + mixedStrings("welcome", "w3resource"))
  println("The new string is: " + mixedStrings("Omiros", "Trypatsas"))

  // Exercise 41.

  def stringRep(string: String, repChars: Int): Unit = {
    println(s"The given strings is: $string")
    println(s"Number of repetition characters and repetition: $repChars")
    val len: Int = string.length
    if (len < repChars) println("String cannot be modified")
    else {
      @tailrec
      def acc(string: String, new_string: String, repChars: Int): Unit = {
        if (repChars > 0) acc(string, new_string + string.substring(0, repChars), repChars - 1)
        else println(s"The new string is: " + new_string)
      }
      acc(string, "", repChars)
    }
  }

  stringRep("welcome", 4)

  // Exercise 42.

  def beforeAndAfterString(string: String): String = {
    println(s"The given strings is: $string")
    val len: Int = string.length
    if (len <= 0) "String cannot be modified"
    else {
      @tailrec
      def acc(string: String, position: Int, new_string: String): String = {
        if (position >= len - 1) new_string
        else if (string(position).toString.equals(" ") || string(position - 1).toString.equals(" ") || string(position + 1).toString.equals(" ")) {
          acc(string, position + 1, new_string)
        }
        else {
          acc(string, position + 2, new_string + string(position))
        }
      }
      acc(string, 1, "")
    }
  }

  println("The new string is: " + beforeAndAfterString("weablcoabmeab  and ab"))

  // Exercise 43.

  def tripleChar(string: String): Int = {
    println(s"The given strings is: $string")
    val len: Int = string.length
    if (len <= 0) 0
    else {
      @tailrec
      def acc(string: String, position: Int, noOfTriples: Int): Int = {
        if (position >= len - 1) noOfTriples
        else if (string(position -1) == string(position) && string(position) == string(position + 1)) acc(string, position + 1, noOfTriples + 1)
        else acc(string, position + 1, noOfTriples)
      }
      acc(string, 1, 0)
    }
  }

  println(s"The number of triples in the string is: " + tripleChar("welllcommmmeee"))

  // Exercise 44.

  def isCharHappy(string: String, char: Char): Boolean = {
    println(s"The given strings is: $string")
    val len: Int = string.length
    if (len <= 0) false
    else {
      @tailrec
      def acc(string: String, char: Char, position: Int): Boolean = {
        if (position >= len - 1) false
        else if ((string(position) == char) && (string(position -1) == string(position) || string(position) == string(position + 1))) true
        else acc(string, char, position + 1)
      }
      acc(string, char, 1)
    }
  }

  println("Is z happy in the said string: " + isCharHappy("azzlea", 'z'))
  println("Is f happy in the said string: " + isCharHappy("abcfdkefg", 'f'))

}
