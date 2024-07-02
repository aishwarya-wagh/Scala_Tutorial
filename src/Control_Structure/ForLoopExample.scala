package Control_Structure

object ForLoopExample extends App {
  // Simple for loop
  for (i <- 1 to 10) {
    println(i)
  }

  // For loop with filtering
  for (i <- 1 to 10 if i % 2 == 0) {
    println(s"Even number: $i")
  }

  // For loop with yield
  val squares = for (i <- 1 to 10) yield i * i
  println(s"Squares: $squares")
}
