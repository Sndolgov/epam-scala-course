package com.epam.home_work.battle_game.characters

import com.epam.home_work.battle_game.characters.prototype.{ArmorBearer, Hero}
import com.epam.home_work.battle_game.utils.RandomUtil
import com.epam.home_work.battle_game.weapons.{Sword, Weapon}

class Knight() extends ArmorBearer {

  override var weapon: Weapon = new Sword()

  override var power: Int = setPower()
  override var hp: Int = setHp()

  def setPower(): Int = RandomUtil.getRandomNumber(2, 12)
  def setHp(): Int = RandomUtil.getRandomNumber(2, 12)
}
