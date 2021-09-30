package com.hackerrank.prices.controller;

import com.hackerrank.prices.model.PriceResponse;
import com.hackerrank.prices.service.OpenCloseService;
import com.hackerrank.prices.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PricesController implements IPricesController {

    private final PriceService service;

    private final OpenCloseService openCloseService;

    public ResponseEntity<PriceResponse> prices(Integer page) {
        return ResponseEntity.ok(service.getStocks(page));
    }

    public ResponseEntity<String> openClosePrices(String firstDate, String lastDate) {
        return ResponseEntity.ok(openCloseService.openAndClosePrices(firstDate, lastDate));
    }
}
