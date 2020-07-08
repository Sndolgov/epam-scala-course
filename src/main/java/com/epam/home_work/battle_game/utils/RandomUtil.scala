package com.epam.home_work.battle_game.utils

import scala.util.Random

object RandomUtil {
  def getRandomNumber(min:Int, max:Int):Int ={
    (Random.nextDouble()*(max-min) + min).toInt
  }
}
