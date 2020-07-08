package com.epam.home_work.battle_game.weapons

import com.epam.home_work.battle_game.utils.RandomUtil

class Sword() extends Weapon {
  def damage(power:Int):Int= {
    RandomUtil.getRandomNumber(1, power)
  }
}
