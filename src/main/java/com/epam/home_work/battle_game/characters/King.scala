package com.epam.home_work.battle_game.characters

import com.epam.home_work.battle_game.utils.RandomUtil
import com.epam.home_work.battle_game.weapons.{Sword, Weapon}

case class King() extends ArmorBearer with Hero {
  override var power: Int = RandomUtil.getRandomNumber(5, 15)
  override var hp: Int = RandomUtil.getRandomNumber(5, 15)
  override var weapon: Weapon = new Sword()

  override protected def kick(rival: Hero): Unit = kickWithWeapon(rival)
}
