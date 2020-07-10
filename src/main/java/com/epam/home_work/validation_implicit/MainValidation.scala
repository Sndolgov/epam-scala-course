package com.epam.home_work.validation_implicit

import com.epam.home_work.validation_implicit.ValidationClass.StringVal

object MainValidation {
  def main(args: Array[String]): Unit = {
    implicit val text: String = "s@s.s"
    val additionalData: String = "additionalData"
    implicit val number: Int = 1
//    ValidationVariable.isEmail(additionalData)

    additionalData.isEmail;


  }
}
