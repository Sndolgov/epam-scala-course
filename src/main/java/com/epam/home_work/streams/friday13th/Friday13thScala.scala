package com.epam.home_work.streams.friday13th

import java.time.{DayOfWeek, LocalDate, Period}

object Friday13th {
  def main(args: Array[String]): Unit = {
    println(countFriday13th(1900, 2000))

  }

    def countFriday13th(startYear: Int, endYear: Int):List[(Int,Int)] = {
     Iterator.iterate(LocalDate.of(startYear, 1, 13))(_.plusMonths(1)).takeWhile(_.isBefore(LocalDate.of(endYear, 12, 13)))
        .filter(d=> d.getDayOfWeek == DayOfWeek.FRIDAY)
       .map(_.getYear)
       .toList
       .groupBy(identity)
       .map(e=> (e._1, e._2.size))
       .toList
       .sortBy(_._1)
       .sortBy(-_._2)
    }
}


