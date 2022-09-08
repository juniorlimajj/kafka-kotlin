package io.github.juniorlimajj.kotlinkafka.producer

import io.github.juniorlimajj.kotlinkafka.data.Message
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Component
class Producer(
    val kafkaTemplate: KafkaTemplate<String, String?>
){
    private val logger: Logger = LoggerFactory.getLogger(Producer::class.java)
    private val TOPIC = "product"

    fun sendMessage(message: Message?) {
        logger.info(String.format("#### -> Sent message -> %s", message))
        kafkaTemplate.send(TOPIC, message.toString())
    }
}