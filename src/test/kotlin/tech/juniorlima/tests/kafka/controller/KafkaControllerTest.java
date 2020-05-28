package tech.juniorlima.tests.kafka.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tech.juniorlima.tests.kafka.engine.Producer;

public class KafkaControllerTest {

  @Mock
  Producer producer;
  @InjectMocks
  KafkaController kafkaController;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testKafkaController() throws Exception {
    kafkaController.KafkaController(new Producer());
  }

  @Test
  public void testSendMessageToKafkaTopic() throws Exception {
    kafkaController.sendMessageToKafkaTopic("message");
  }
}