package com.epam.traits

/**
 * @author Evgeny Borisov
 */
trait Killer{


  println("some killer was created")



  def id: Int
  val strength: Int

  def killAll(): Unit = {
    println("стреляет снайпер по номером "+id)
    println("все убиты")
  }

  def resurrect():Unit

}
