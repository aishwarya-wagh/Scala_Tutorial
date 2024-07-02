object VariablesAndDataTypes extends App {
  // Immutable variable
  val immutableString: String = "I cannot be changed"
  println(immutableString)

  // Mutable variable
  var mutableInt: Int = 42
  println(mutableInt)

  // Changing the value of mutable variable
  mutableInt = 50
  println(mutableInt)

  // Different data types
  val anInt: Int = 100
  val aDouble: Double = 3.14
  val aBoolean: Boolean = true
  val aChar: Char = 'A'
  val aString: String = "Scala"

  println(s"Int: $anInt, Double: $aDouble, Boolean: $aBoolean, Char: $aChar, String: $aString")
}
