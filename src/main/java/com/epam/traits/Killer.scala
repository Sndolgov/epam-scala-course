package com.epam.traits

/**
 * @author Evgeny Borisov
 */
trait Killer {


  println("some killer was created")

  val name:String


  def id: Int

  def killAll(): Unit = {
    println("стреляет снайпер по номером "+id)
    println("все убиты")
  }

  def resurrect:Int

}
