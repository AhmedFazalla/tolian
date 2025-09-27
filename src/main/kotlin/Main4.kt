package org.example

import java.util.function.Predicate

fun main() {
  print("Input string: ")
  val userInput = readln()

  val lambda: (Char) -> Boolean = {
    it.isLetter()
  }
  
  println(userInput.filter(::isL))
  println(userInput.filtered { it.isLetter() })
  println(userInput.myFilter { it.isLetter() })
  println(userInput.filtered(lambda))
  println(userInput.filtered(labda()))
}

fun String.myFilter(predicate: (Char) -> Boolean): String = buildString { 
  for(i in this@myFilter) {
    if(predicate(i)) {
      append(i)
    }
  }
}
//same above
fun String.myFilter1(predicate: Char.() -> Boolean): String = buildString {
  for(i in this@myFilter1) {
    if(predicate(i)) {
      append(i)
    }
  }
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

fun labda(): (Char) -> Boolean = {
  it.isLetter()
}
