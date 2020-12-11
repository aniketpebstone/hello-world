package org.aniket.config;

import io.sentry.SentryEvent;
import io.sentry.EventProcessor;
import org.springframework.stereotype.Component;

//@Component
public class CustomEventProcessor implements EventProcessor {
  @Override
  public SentryEvent process(SentryEvent event, Object hint) {
    // modify the event or return null to drop it
	  System.out.println("Envirnment:"+event.getEnvironment());
	  if(event.getEnvironment().equals("sandbox"))
	  {
		  return null;
	  }
    return event;
  }
}