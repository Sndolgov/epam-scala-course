package com.epam.implicits

/**
 * @author Evgeny Borisov
 */
case class Employee(age:Int,name:String) {

  def printDetails():Unit = println(this)

}
