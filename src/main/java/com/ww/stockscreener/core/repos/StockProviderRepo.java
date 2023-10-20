package com.ww.stockscreener.core.repos;

import com.ww.stockscreener.core.models.StockBar;

import java.time.LocalDate;
import java.util.List;

public interface StockProviderRepo {
    List<StockBar> getBarsForEntireMarket(LocalDate startDate,
                                          LocalDate endDate);
}
