package com.epam.quoters

import java.time.LocalDate

/**
 * @author Evgeny Borisov
 */
object MainQuoters {
  def main(args: Array[String]): Unit = {


    var strings = List("java", "scala") //todo list of strings shoud be uppercased
    val date = LocalDate.now()

    //todo public printSortedFriday13(int startYear, int endYear) build and sort maps which will look like:[(1912:3),(1916,3)/...]

    strings = "groovy"::"kotlin" :: strings
    println(strings)
    //    var foo = 10
    //    val plusFoo=(x:Int)=>x+foo
    //
    //    println(plusFoo(1))

    //    val aggregator = new QuoterAggregator(List(RandomQuoter, new ShakespearQuoter(), MessageQuoter("bla bla")))
    //    aggregator.sayAll()


  }
}
