package com.epam.home_work.validation_implicit

case class ValidationMethod(text: String) {
  def isEmail:Boolean={
    val result = text.contains("@") && text.contains(".")
    println("The email " + text + " valid: " + result)
    result
  }
}

object ValidationMethod {
  implicit def createValidation(s:String):ValidationMethod=new ValidationMethod(s)
}
