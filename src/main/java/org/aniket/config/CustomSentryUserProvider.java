package org.aniket.config;

import org.springframework.stereotype.Component;

import io.sentry.protocol.User;
import io.sentry.spring.SentryUserProvider;

@Component
class CustomSentryUserProvider implements SentryUserProvider {
    public User provideUser() {
        User user = new User();
        // ... set user information
        user.setId("32");
        user.setUsername("Teno Admin");
        return user;
    }
}