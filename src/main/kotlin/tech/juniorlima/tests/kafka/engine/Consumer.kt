package tech.juniorlima.tests.kafka.engine

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service
import java.io.IOException

@Service
class Consumer {
  private val logger: Logger = LoggerFactory.getLogger(Producer::class.java)

  @KafkaListener(topics = ["users"], groupId = "kotlin-test")
  @Throws(IOException::class)
  fun consume(message: String?) {
    logger.info(String.format("#### -> Received message -> %s", message))
  }
}