package com.heroes

/**
 * @author Evgeny Borisov
 */
class Knight extends Hero {


  var weapon:Weapon = new Axe

  override def kick(enemy: Hero): Unit = weapon.kick(this,enemy)
}
