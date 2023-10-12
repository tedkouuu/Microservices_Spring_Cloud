package com.microservices.limitsservice.beans;

public class Limits {

    private int minimum;
    private int maximum;

    public Limits() {
    }

    public Limits(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public Limits setMinimum(int minimum) {
        this.minimum = minimum;
        return this;
    }

    public int getMaximum() {
        return maximum;
    }

    public Limits setMaximum(int maximum) {
        this.maximum = maximum;
        return this;
    }
}
