package com.implicit_class

import scala.util.Random

/**
 * @author Evgeny Borisov
 */
object Converters {
  implicit class StringExt(str:String){
    def isEmail: Boolean =str.contains("@")&&str.contains(".")
  }

  implicit class IntExt(num: Int){
    def toMax(max:Int): Int = Random.nextInt(max-num)+num
  }
}
