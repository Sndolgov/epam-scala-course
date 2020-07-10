package com.epam.validators

import org.springframework.stereotype.Component

/**
 * @author Evgeny Borisov
 */
@Component
class Validator1 extends DataValidator{
  override def validate(data: String): Unit = println(11111111)
}
