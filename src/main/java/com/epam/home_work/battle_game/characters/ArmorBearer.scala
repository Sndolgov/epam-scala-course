package com.epam.home_work.battle_game.characters

import com.epam.home_work.battle_game.weapons.Weapon

trait ArmorBearer{
  var weapon:Weapon
  var power:Int

  def kickWithWeapon(rival: Hero): Unit = {
    rival.hp-=weapon.damage(power)
  }

}
