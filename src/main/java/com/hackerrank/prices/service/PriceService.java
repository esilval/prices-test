package com.hackerrank.prices.service;

import com.hackerrank.prices.model.PriceResponse;
import com.hackerrank.prices.proxy.StocksClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PriceService {

    private final StocksClient client;

    public PriceResponse getStocks(Integer page) {
        return client.getStocks(page);
    }
}
