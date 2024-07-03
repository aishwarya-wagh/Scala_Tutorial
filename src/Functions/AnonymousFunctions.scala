package Functions

object AnonymousFunctions extends App {
  // Anonymous function to increment a number
  val increment = (x: Int) => x + 1

  // Anonymous function to multiply two numbers
  val multiply = (x: Int, y: Int) => x * y

  // Using anonymous functions
  val incrementedValue = increment(5)
  val product = multiply(3, 4)

  println(s"Incremented Value: $incrementedValue")
  println(s"Product: $product")

  // Anonymous function within a higher-order function
  val numbers = List(1, 2, 3, 4, 5)
  val incrementedNumbers = numbers.map(x => x + 1)

  println(s"Incremented Numbers: $incrementedNumbers")
}

