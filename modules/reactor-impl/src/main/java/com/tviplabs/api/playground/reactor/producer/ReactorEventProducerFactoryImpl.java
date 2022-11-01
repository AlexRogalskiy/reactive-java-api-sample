package com.tviplabs.api.playground.reactor.producer;

import com.tviplabs.api.playground.interfaces.producer.event.EventProducer;
import com.tviplabs.api.playground.interfaces.producer.event.EventProducerFactory;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import java.util.Properties;

/**
 * Reactor event producer factory implementation based on Reactor API.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to produce.
 */
@Slf4j
public class ReactorEventProducerFactoryImpl<E> implements EventProducerFactory<E> {

  /** Default logging configuration {@link Marker} instance */
  private static final Marker DEFAULT_LOGGING_MARKER =
      MarkerFactory.getMarker("ReactorEventProducerFactoryImpl");

  @Override
  public EventProducer<E> create(final Properties base) {
    log.info(DEFAULT_LOGGING_MARKER, ">>> Producer factory properties: {}", base);
    return null;
  }
}
