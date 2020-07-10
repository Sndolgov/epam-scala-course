package com.epam.home_work.validation_implicit

object ValidationVariable {
  def isEmail(additionalData: Any)(implicit text: String, number: Int): Boolean = {
    val result = text.contains("@") && text.contains(".")
    println("The email " + text + " valid: " + result)
    println("Number: " + number)
    println("AdditionalData: " + additionalData)
    result
  }
}
