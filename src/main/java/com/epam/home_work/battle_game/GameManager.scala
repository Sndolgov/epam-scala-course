package com.epam.home_work.battle_game

import com.epam.home_work.battle_game.characters.prototype.Hero
import com.epam.home_work.battle_game.utils.RandomUtil
import org.reflections.Reflections

import scala.collection.JavaConversions._


object GameManager {
  private val heroesList = new Reflections("com.epam.home_work.battle_game")
  private val allHeroes = heroesList.getSubTypesOf(classOf[Hero]).toList


  def startBattle(): Unit = {
    val firstCharacter: Hero = allHeroes.get(RandomUtil.getRandomNumber(0, allHeroes.size())).newInstance.asInstanceOf[Hero]
    val secondCharacter: Hero = allHeroes.get(RandomUtil.getRandomNumber(0, allHeroes.size())).newInstance.asInstanceOf[Hero]

    println("Сражаются " + firstCharacter.getClass.getSimpleName.toUpperCase() + " с " + secondCharacter.getClass.getSimpleName.toUpperCase())
    Thread.sleep(1000)
    println("Характеристики первого бойца - hp: " + firstCharacter.hp + " power: " + firstCharacter.power)
    println("Характеристики второго бойца - hp: " + secondCharacter.hp + " power: " + secondCharacter.power)

    Thread.sleep(1000)


    var kicksCounter = 0;

    while (firstCharacter.isAlive && secondCharacter.isAlive && kicksCounter < 10) {
      println("First hit")

      firstCharacter.hit(secondCharacter)
      Thread.sleep(1000)
      if (secondCharacter.isAlive) {
        println("Second hit")
        secondCharacter.hit(firstCharacter)
        Thread.sleep(1000)
        kicksCounter += 1
      }
    }

    if (!firstCharacter.isAlive)
      println("Победил " + secondCharacter.getClass.getSimpleName.toUpperCase())
    else if (!secondCharacter.isAlive)
      println("Победил " + firstCharacter.getClass.getSimpleName.toUpperCase())
    else println("В этом бою ничья")
  }
}
