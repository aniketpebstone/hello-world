package org.aniket.config;

import org.springframework.stereotype.Component;

import io.sentry.SentryEvent;
import io.sentry.SentryOptions;

@Component
public class CustomBeforeSendCallback implements SentryOptions.BeforeSendCallback {
  @Override
  public SentryEvent execute(SentryEvent event, Object hint) {
    event.setServerName("Prod-1");
    event.setEnvironment("Prod");
    return event;
  }
}