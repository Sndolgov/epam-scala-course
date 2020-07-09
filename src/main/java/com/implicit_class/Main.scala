package com.implicit_class

/**
 * @author Evgeny Borisov
 */
import Converters._
import org.reflections.Reflections

import scala.util.Random
object Main {
  def main(args: Array[String]): Unit = {

    val scanner = new Reflections("com.epam")
    println("abc@sd.sd".isEmail)
    println(90.toMax(100))
  }
}
