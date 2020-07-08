package com.epam.home_work.quoters

import com.github.javafaker.Faker


trait Quoter {
  def sayMessage(): Unit
}

class MessageQuoter(message:String) extends Quoter{
  override def sayMessage(): Unit = println(message)
}
class ShakespearQuoter(message:String = "2 b || ! 2 b") extends Quoter{
  override def sayMessage(): Unit = println(message)
}
case class RandomQuoter() extends Quoter{

  var faker = new Faker()

  override def sayMessage(): Unit = println(faker.chuckNorris().fact())
}

class QuoterAggregator(quoters:List[Quoter]){
  def sayAll():Unit=
  quoters.foreach(_.sayMessage())
}





