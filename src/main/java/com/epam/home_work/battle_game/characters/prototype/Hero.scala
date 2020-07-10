package com.epam.home_work.battle_game.characters.prototype

trait Hero {
  var power: Int
  var hp: Int

  def isAlive: Boolean = {
    hp > 0
  }

  def hit(rival: Hero): Unit = {
    val hpBefore = rival.hp
    val powerBefore = rival.power
    kick(rival)
    val damageHp =  hpBefore - rival.hp
    val damagePower =  powerBefore - rival.power
    println(this.getClass.getSimpleName + " ударил и отнял  hp: " + damageHp + " и power: " + damagePower)
    println("У " + rival.getClass.getSimpleName + " hp : " + rival.hp + " power: " + rival.power)
  }


  protected def kick(rival: Hero): Unit
}
