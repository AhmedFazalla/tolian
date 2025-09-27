package org.example

import java.util.function.Predicate

fun main() {
  print("Input string: ")
  val userInput = readln()

  println(userInput.filtered { it.isLetter() })
}

fun String.filtered(predicate: (Char) -> Boolean): String {
  val list = mutableListOf<Char>()
  for(i in this) {
    if(predicate(i)){
      list.add(i)
    }
  }
  return list.joinToString("")
}

fun <T> Iterable<T>.filtered(predicate: (T) -> Boolean): List<T> {
  val list = mutableListOf<T>()
  for(i in this) {
    if(predicate(i)){
      list.add(i)
    }
  }
  return list
}
