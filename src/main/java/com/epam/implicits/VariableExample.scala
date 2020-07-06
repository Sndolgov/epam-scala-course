package com.epam.implicits

/**
 * @author Evgeny Borisov
 */
object VariableExample {



  def printMe (implicit text:String,text2:String): Unit =println(text+" asdasd "+text2)


}
