package com.epam.list_to_map

case object Main
{
  def main(args: Array[String]): Unit = {
    var list = List("asd", "fgh", "uio", "asd", "fgh","asd", "fgh","asd")
    var map = list.groupBy(identity).map(e=> (e._1, e._2.length)).toMap

    println(map)
    println(map.maxBy(_._2)._1)


  }
}
