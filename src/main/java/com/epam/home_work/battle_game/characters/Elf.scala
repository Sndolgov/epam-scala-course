package com.epam.home_work.battle_game.characters

import com.epam.home_work.battle_game.characters.prototype.Hero

class Elf() extends Hero {
  override var power: Int = 10
  override var hp: Int = 10


  override def hit(rival: Hero): Unit = {
    super.hit(rival)
  }

  override def kick(rival: Hero): Unit = {
    if (power>rival.power)
      rival.hp = 0
    else {
      rival.power-=1
    }
  }
}
