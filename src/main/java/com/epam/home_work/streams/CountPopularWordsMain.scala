package com.epam.home_work.streams

/**
 * @author Evgeny Borisov
 */
object CountPopularWordsMain {

  def main(args: Array[String]): Unit = {
    val tuples = List(("word", 1), ("word", 1), ("java", 1))

  }


  def getPopular(str: String, number: Int): List[(String, Int)] = {


    str.split(" ").
      groupBy(identity).
      map((entry) => (entry._1, entry._2.length)).
      toList.
      sortWith((ent1, ent2) => ent1._2 > ent2._2).
      take(number)
  }
}
