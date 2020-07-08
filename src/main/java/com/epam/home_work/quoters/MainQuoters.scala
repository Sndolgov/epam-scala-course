package com.epam.home_work.quoters

object MainQuoters {
  def main(args: Array[String]): Unit = {
    val agg = new QuoterAggregator(List(new MessageQuoter("Hello world!"), new ShakespearQuoter(), RandomQuoter()))
    agg.sayAll()

  }
}
