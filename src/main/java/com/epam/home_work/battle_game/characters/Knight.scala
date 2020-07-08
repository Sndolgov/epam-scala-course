package com.epam.home_work.battle_game.characters

import com.epam.home_work.battle_game.utils.RandomUtil
import com.epam.home_work.battle_game.weapons.{Sword, Weapon}

class Knight() extends ArmorBearer with Hero {

  override var power: Int = RandomUtil.getRandomNumber(2, 12)
  override var hp: Int = RandomUtil.getRandomNumber(2, 12)
  override var weapon: Weapon = new Sword()

  override protected def kick(rival: Hero): Unit = kickWithWeapon(rival)
}
