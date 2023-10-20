package com.ww.stockscreener.core.models;

import java.time.ZonedDateTime;

public record StockBar(
        String ticker,
        double close,
        double high,
        double low,
        double open,
        ZonedDateTime windowStart,
        double volume
) {
}
