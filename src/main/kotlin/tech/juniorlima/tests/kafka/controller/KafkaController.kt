package tech.juniorlima.tests.kafka.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import tech.juniorlima.tests.kafka.engine.Producer

@RestController
@RequestMapping("/kafka")
class KafkaController {
  private var producer: Producer? = null

  @Autowired
  fun KafkaController(producer: Producer?) {
    this.producer = producer
  }

  @PostMapping("/publish")
  fun sendMessageToKafkaTopic(@RequestParam("message") message: String?) {
    producer?.sendMessage(message)
  }
}