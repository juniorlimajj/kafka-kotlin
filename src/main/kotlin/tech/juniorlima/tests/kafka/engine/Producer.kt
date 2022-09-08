package tech.juniorlima.tests.kafka.engine

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class Producer {
  private val logger: Logger = LoggerFactory.getLogger(Producer::class.java)
  private val TOPIC = "users"

  @Autowired
  private lateinit var kafkaTemplate: KafkaTemplate<String, String?>
  fun sendMessage(message: String?) {
    logger.info(String.format("#### -> Sent message -> %s", message))
    kafkaTemplate!!.send(TOPIC, message)
  }
}