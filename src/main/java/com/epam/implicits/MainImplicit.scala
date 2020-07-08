package com.epam.implicits
import java.util

import Constants2._

import scala.collection.JavaConverters._
/**
 * @author Evgeny Borisov
 */
object MainImplicit {


  def main(args: Array[String]): Unit = {


    val javaList: util.List[Int] = List(1, 2, 3).asJava

    val scalaList = javaList.asScala
    
    javaList.forEach(println(_))
    scalaList.foreach(println(_))


    import SparkUtils.dataframeToDataset

    SparkUtils.filter(new Dataframe)


    val converter = new PersonConverter(defaultAge = 120,defaultName = "Gena")
    import converter._

    12.printDetails()

    def employee:Employee = "Shmuel"
    println(employee)




    VariableExample.printMe(Constants.javaName,Constants2.scalaName)
    //    VariableExample.printMe
    //    VariableExample.printMe
  }

}
