package com.heroes

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
    val knight = new Knight
    knight.kick(null)
    knight.weapon = new Sword

    knight.kick(null)
  }

}
