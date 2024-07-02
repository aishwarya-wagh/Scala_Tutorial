package Control_Structure

object PatternMatchingExample extends App {
  val number = 2

  number match {
    case 1 => println("One")
    case 2 => println("Two")
    case 3 => println("Three")
    case _ => println("Other")
  }

  // Pattern matching with types
  def process(value: Any): String = value match {
    case i: Int => s"Integer: $i"
    case s: String => s"String: $s"
    case _ => "Unknown type"
  }

  println(process(42))
  println(process("Scala"))
  println(process(3.14))
}
