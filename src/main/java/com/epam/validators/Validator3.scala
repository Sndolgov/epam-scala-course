package com.epam.validators

import org.springframework.stereotype.Component

/**
 * @author Evgeny Borisov
 */
@Component
class Validator3 extends DataValidator{
  override def validate(data: String): Unit = println(3333)
}
