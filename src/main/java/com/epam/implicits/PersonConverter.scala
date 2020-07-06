package com.epam.implicits

/**
 * @author Evgeny Borisov
 */
case class PersonConverter(defaultName:String,defaultAge:Int) {

  implicit def ageToEmployee(age:Int):Employee=Employee(age = age,name = defaultName)
  implicit def nameToEmployee(name:String):Employee=Employee(name = name,age = defaultAge)

}
