package com.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {

    private int minimum;
    private int maximum;

    public Configuration setMinimum(int minimum) {
        this.minimum = minimum;
        return this;
    }

    public Configuration setMaximum(int maximum) {
        this.maximum = maximum;
        return this;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }
}
