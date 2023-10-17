package com.ww.stockscreener.core;

public class StockInfo {
    private String tickerSymbol;
    private double marketCap;

    public StockInfo(String tickerSymbol, double marketCap) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }
}
