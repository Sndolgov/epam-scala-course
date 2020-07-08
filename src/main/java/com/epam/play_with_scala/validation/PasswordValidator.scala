package com.epam.play_with_scala.validation

case class PasswordValidator(username:String, password: String, confirmPassword: String) {
  def validate():String={
    if (password.toLowerCase()=="admin")
       return "Name can't be \"admin\"" + "password: " + password
    else if (password.toLowerCase.startsWith("z"))
      return "Password can't start with \"z\"" + "password: " + password
    else if (password.toLowerCase==username.toLowerCase)
      return "Password can't be equal to username" + "password: " + password + "username" + username
    else if (password.replaceAll("[0-9]", "")=="")
      return "Password can't contains only digits: " + password + "username" + username
    null
  }
}
