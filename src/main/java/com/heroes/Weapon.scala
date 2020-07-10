package com.heroes

/**
 * @author Evgeny Borisov
 */
trait Weapon {

  def kick(attacker:Hero,defender:Hero)
}



class Sword extends Weapon {
  override def kick(attacker: Hero, defender: Hero): Unit = println("vjikd vjik")
}
class Axe extends Weapon {
  override def kick(attacker: Hero, defender: Hero): Unit = println("hryak")
}
