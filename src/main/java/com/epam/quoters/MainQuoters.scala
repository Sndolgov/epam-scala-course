package com.epam.quoters

/**
 * @author Evgeny Borisov
 */
object MainQuoters {
  def main(args: Array[String]): Unit = {


    val aggregator = new QuoterAggregator(List(RandomQuoter, new ShakespearQuoter(), MessageQuoter("bla bla")))
    aggregator.sayAll()


  }
}
