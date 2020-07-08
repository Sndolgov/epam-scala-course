package com.epam.home_work.battle_game.characters

case class Hobbit() extends Hero {
  override var power: Int = 0
  override var hp: Int = 3

  override def kick(rival: Hero): Unit = {
    println("I am crying!")
  }
}
