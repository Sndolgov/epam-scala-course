package com.implicit_class

import com.epam.quoters.Quoter

/**
 * @author Evgeny Borisov
 */
class FakerQuoetr extends Quoter{
  override def sayMessage(): Unit = println(12)
}
