package io.github.juniorlimajj.kotlinkafka.consumer

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import java.io.IOException

@Component
class Consumer {
    private val logger: Logger = LoggerFactory.getLogger(Consumer::class.java)

    @KafkaListener(topics = ["product"], groupId = "kotlin-test")
    @Throws(IOException::class)
    fun consume(message: String?) {
        logger.info(String.format("#### -> Received message -> %s", message))
    }
}