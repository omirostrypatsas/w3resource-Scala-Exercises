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

}
