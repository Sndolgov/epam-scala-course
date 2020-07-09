package com.epam.validators

import javax.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.event.{ContextRefreshedEvent, EventListener}
import org.springframework.scheduling.annotation.{EnableScheduling, Scheduled}
import org.springframework.stereotype.Service

import scala.collection.JavaConverters._

/**
 * @author Evgeny Borisov
 */

@Service
@EnableScheduling
class MainValidator(list:java.util.List[DataValidator]) {

  var validators: List[DataValidator] = list.asScala.toList



  @Scheduled(fixedDelay = 1000)
  def validateAll(): Unit = {
    validators.foreach(_.validate("data"))
  }
}
