package com.tviplabs.api.playground.reactor.consumer;

import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumer;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import java.util.Map;

/**
 * Reactor event consumer implementation based on Reactor API.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to consume.
 */
@Slf4j
@RequiredArgsConstructor
public class ReactorEventConsumerImpl<E> implements EventConsumer<E> {

  /** Default logging configuration {@link Marker} instance */
  private static final Marker DEFAULT_LOGGING_MARKER =
      MarkerFactory.getMarker("ReactorEventConsumerImpl");

  @NonNull private final Map<String, Object> configMap;

  @Override
  public void subscribe(final E event) {
    log.info(DEFAULT_LOGGING_MARKER, ">>> Consuming event: {}", event);
    final var t = this.configMap;
  }
}