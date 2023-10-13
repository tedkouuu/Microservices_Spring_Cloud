package com.microservices.currencyexchangeservice.entitiy;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "currency_exchange")
public class CurrencyExchange {

    @Id
    private Long id;

    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;

    @Column(name = "conversion_multiple")
    private BigDecimal conversionMultiple;
    private String environment;

    public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public CurrencyExchange() {

    }

    public String getEnvironment() {
        return environment;
    }

    public CurrencyExchange setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    public Long getId() {
        return id;
    }

    public CurrencyExchange setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public CurrencyExchange setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public CurrencyExchange setTo(String to) {
        this.to = to;
        return this;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public CurrencyExchange setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
        return this;
    }
}
