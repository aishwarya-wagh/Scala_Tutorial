package Functions

object HigherOrderFunctions extends App {
  // A higher-order function that applies a function to an integer
  def applyFunction(f: Int => Int, x: Int): Int = {
    f(x)
  }

  // A function that doubles an integer
  val double = (x: Int) => x * 2

  // Using the higher-order function
  val result = applyFunction(double, 5)

  println(s"Result of applying the function: $result")

  // Another example with a list of numbers
  val numbers = List(1, 2, 3, 4, 5)
  val doubledNumbers = numbers.map(double)

  println(s"Doubled Numbers: $doubledNumbers")
}
