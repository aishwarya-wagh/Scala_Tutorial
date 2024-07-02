object Operators extends App {
  val a = 10
  val b = 20

  // Arithmetic operators
  val sum = a + b
  val difference = b - a
  val product = a * b
  val quotient = b / a
  val remainder = b % a

  println(s"Sum: $sum")
  println(s"Difference: $difference")
  println(s"Product: $product")
  println(s"Quotient: $quotient")
  println(s"Remainder: $remainder")

  // Relational operators
  println(s"a == b: ${a == b}")
  println(s"a != b: ${a != b}")
  println(s"a > b: ${a > b}")
  println(s"a < b: ${a < b}")
  println(s"a >= b: ${a >= b}")
  println(s"a <= b: ${a <= b}")

  // Logical operators
  val x = true
  val y = false

  println(s"x && y: ${x && y}")
  println(s"x || y: ${x || y}")
  println(s"!x: ${!x}")

  // Bitwise operators
  val bitwiseAnd = a & b
  val bitwiseOr = a | b
  val bitwiseXor = a ^ b
  val bitwiseNeg = ~a
  val leftShift = a << 2
  val rightShift = a >> 2
  val unsignedRightShift = a >>> 2

  println(s"Bitwise AND: $bitwiseAnd")
  println(s"Bitwise OR: $bitwiseOr")
  println(s"Bitwise XOR: $bitwiseXor")
  println(s"Bitwise NOT: $bitwiseNeg")
  println(s"Left Shift: $leftShift")
  println(s"Right Shift: $rightShift")
  println(s"Unsigned Right Shift: $unsignedRightShift")
}
