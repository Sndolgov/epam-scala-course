package com.epam.traits

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
 /*   val words: Array[String] = Array("sd", "a")

    Stam.printStrings("asdas")

    val mapper = new ObjectMapper()
    val human = mapper.readValue("""{"age":10}""", classOf[Human])
    println(human.getAge)*/

    val hitman = new Hitman(10)
    println(hitman)
    println(hitman.strength)
  }
}
