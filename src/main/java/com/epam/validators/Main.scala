package com.epam.validators

import org.springframework.context.annotation.AnnotationConfigApplicationContext

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
    val context = new AnnotationConfigApplicationContext("com.epam.validators")
  }

}
