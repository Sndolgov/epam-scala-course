package com.epam.home_work.battle_game.characters.prototype

import com.epam.home_work.battle_game.weapons.Weapon

trait ArmorBearer extends Hero {
  var weapon:Weapon

  override def kick(rival: Hero): Unit = rival.hp-=weapon.damage(power)
}
