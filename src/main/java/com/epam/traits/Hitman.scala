package com.epam.traits

/**
 * @author Evgeny Borisov
 */
case class Hitman(id: Int,resurrect:Int) extends Killer {
  override val name: String = "sdf".toLowerCase()
}
