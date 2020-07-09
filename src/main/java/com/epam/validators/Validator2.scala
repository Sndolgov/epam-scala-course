package com.epam.validators

import org.springframework.stereotype.Component

/**
 * @author Evgeny Borisov
 */
@Component
class Validator2 extends DataValidator{
  override def validate(data: String): Unit = println(222222222)
}
