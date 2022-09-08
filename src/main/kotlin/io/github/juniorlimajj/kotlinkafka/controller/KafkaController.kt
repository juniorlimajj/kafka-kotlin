package io.github.juniorlimajj.kotlinkafka.controller

import io.github.juniorlimajj.kotlinkafka.data.Message
import io.github.juniorlimajj.kotlinkafka.producer.Producer
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kafka")
class KafkaController(
    val producer: Producer
) {
    @PostMapping("/publish")
    fun sendMessageToKafkaTopic(@RequestBody message: Message) {
        producer.sendMessage(message)
    }
}