package tech.juniorlima.tests.kafka.engine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import static org.mockito.Mockito.*;

public class ConsumerTest {

  @Mock
  Logger logger;
  @InjectMocks
  Consumer consumer;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testConsume() throws Exception {
    consumer.consume("message");
  }
}