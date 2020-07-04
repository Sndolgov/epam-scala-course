package com.epam.traits

/**
 * @author Evgeny Borisov
 */
case class Hitman(strength: Int) extends Killer {

  val x = 10;

  override def resurrect: Nothing = throw new UnsupportedOperationException

  override lazy val id: Int = {

    x * 10
  }
}

/*object Hitman {

  def apply() = new Hitman(10)

}*/
