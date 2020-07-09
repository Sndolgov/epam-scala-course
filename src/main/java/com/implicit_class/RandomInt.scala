package com.implicit_class

/**
 * @author Evgeny Borisov
 */
import scala.util.Random

object RandomInt {

  implicit class RandomInt(from: Int = 0) {
    def --(to: Int): Int = from + Random.nextInt(to - from + 1) // random number inclusive...inclusive
  }
}