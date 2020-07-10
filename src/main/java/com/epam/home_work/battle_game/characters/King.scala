package com.epam.home_work.battle_game.characters

import com.epam.home_work.battle_game.utils.RandomUtil
import com.epam.home_work.battle_game.weapons.{Sword, Weapon}

case class King() extends Knight {
  override def setPower(): Int = RandomUtil.getRandomNumber(5, 15)

  override def setHp(): Int = RandomUtil.getRandomNumber(5, 15)
}
