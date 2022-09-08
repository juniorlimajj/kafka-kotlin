package tech.juniorlima.tests.kafka.engine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.kafka.core.KafkaTemplate;

import static org.mockito.Mockito.*;

public class ProducerTest {

  @Mock
  Logger logger;
  @Mock
  KafkaTemplate<String, String> kafkaTemplate;
  @InjectMocks
  Producer producer;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testSendMessage() throws Exception {
    producer.sendMessage("message");
  }
}