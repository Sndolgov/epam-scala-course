package com.epam.java_vs_scala_lambda

/**
 * @author Evgeny Borisov
 */
object ScalaMain {
  def main(args: Array[String]): Unit = {
    List(2,3,1,5).sortWith((a,b)=>a>b).foreach(println(_))
  }
}
