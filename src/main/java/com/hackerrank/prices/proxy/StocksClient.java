package com.hackerrank.prices.proxy;

import com.hackerrank.prices.model.PriceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "${prices.stocks.api.name}", url = "${prices.stocks.api.uri}")
public interface StocksClient {

    @RequestMapping(method = RequestMethod.GET)
    PriceResponse getStocks(@RequestParam("page") Integer page);

}
