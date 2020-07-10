package com.epam.home_work.validation_implicit

object ValidationClass {
  implicit class StringVal(text:String){
    def isEmail:Boolean={
      val result = text.contains("@") && text.contains(".")
      println("The email " + text + " valid: " + result)
      result
    }
  }
}
