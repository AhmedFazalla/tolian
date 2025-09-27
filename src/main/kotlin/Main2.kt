package org.example

fun main() {
//  try {
//      print("Input number: ")
//      val userInput = readln().toInt()
//
//      println("Inputted user number: ${userInput}")
//  } catch (e: Exception) {
//    println("Naloko na ka${e.message}")
//  }

  print("Input number: ")
  val userInput = readln().toIntOrNull()?.rem(2)?.equals(0)
  userInput.let { user -> println("hala ka $user") }
  println("Inputted user number: $userInput")

  val names = listOf("Alice", "Bob", "Charlie")
  val nameArray = "Hello"
  println(nameArray.last())

  println()
  println()

  println("Input another for this: ")
  val anotherUserInput = readln().toInt()
  if (anotherUserInput != null) {
    val output =
      if (anotherUserInput % 2 == 0) {
        "Hello world"
      } else {
        "boanga"
      }
    println(output)

    val anotherOutput =
      when {
        anotherUserInput % 2 == 0 -> "even ni siya"
        else -> "nagapataka"
      }
    println(anotherOutput)

    val anotherOutput1 =
      when (anotherUserInput) {
        3 -> "three ni siya"
        5 -> "5 ni siya"
        in 6..20 -> "sulod sa range"
        else -> "nagapataka"
      }
    println(anotherOutput1)
  }

  for (i in 0..10) {
    println("hala $i")
  }

  for (i in 0 until 10) {
    println("hala $i")
  }
}
