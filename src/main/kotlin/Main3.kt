package org.example

fun main() {
  print("Input string: ")
  val userInput = readln()

  println("$userInput asdf ${userInput.reverse()}")

  println(userInput)
  println(reverseString(userInput))

  if (userInput == reverseString(userInput)) {
    println("palindrome")
  } else {
    println("not palindrome")
  }
  val address = Address(street = "Tejero", streetNo = 123)
  val user =
    User(name = "Joebert", age = 2, address).also {
      println("also ni siya")
    }
  user.toKick()
}

fun reverseString(str: String): String =
  buildString {
    for (i in str.lastIndex downTo 0) {
      append(str[i])
    }
  }

// correct implementation of the `this`, which explicitly refers to the String class
fun String.reverse(): String =
  buildString {
    for (i in this@reverse.lastIndex downTo 0) {
      append(this@reverse[i])
    }
  }

// this will return nothing, because the `this` refers to the buildString
fun String.reverse1(): String =
  buildString {
    for (i in lastIndex downTo 0) {
      append(this[i])
    }
  }

class Address(
  street: String,
  streetNo: Int,
)

class User(
  val name: String,
  age: Int,
  address: Address,
) {
  init {
    println("halaaaa")
    require(age < 10) { "houyy bata $age" }
  }
}

fun User.toKick() {
  println("Hello user $name")
}
