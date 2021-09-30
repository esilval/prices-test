package com.hackerrank.prices.controller;

import com.hackerrank.prices.model.PriceResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface IPricesController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<PriceResponse> prices(@RequestParam("page") Integer page);

    @GetMapping(value = "/open-close", produces = MediaType.TEXT_PLAIN_VALUE)
    ResponseEntity<String> openClosePrices(@RequestParam("first-date") String firstDate, @RequestParam("last-date") String lastDate);
}
