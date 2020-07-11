package com.epam.home_work.tests.unapply

import scala.collection.immutable.List

object UnApply {
  def main(args: Array[String]): Unit = {


    val nums = List(1, 2, 3)
    val List(a, b, c) = nums
    //    println(a)
    //    println(b)
    //    println(c)

    val person = Person("Vasya", "P", 12)
    val List(v, m) = Person.unapply(person);
    println(v)
    println(m)


    //        println(fn)
    //        println(ln)
    //        println(age)


  }
}

case class Person(firstName: String, lastName: String, age: Int)

object Person {
  def unapply(person: Person): List[String] =
    List(person.firstName, person.lastName)
}



