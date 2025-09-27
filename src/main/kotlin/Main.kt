package org.example

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  val name = "Kotlin"
  // TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.
  println("Hello, " + name + "!")

  println("Hello world")

  for (i in 1..5) {
    // TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
    // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
    println("i = $i")
  }

  for (i in 1..10) {
    println("Hello = $i")
  }
  var x = 10
  val sum = ++x + 5
  println(sum)

  println("Hello world  ${sum % 2 == 0}")

  val num1 = 11
  val num2 = 12
  val areTheSame = num1 % 2 == 0 && num2 % 2 == 0
  println(num1 % 2 == 0)
  println(num2 % 2 == 0)
  println(areTheSame)
  println()

  println("Input number: ")
  val userInput = readln()

  println("Inputted number = $userInput")
}
