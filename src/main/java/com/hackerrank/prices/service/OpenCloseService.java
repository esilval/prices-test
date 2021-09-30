package com.hackerrank.prices.service;

import com.hackerrank.prices.model.PriceData;
import com.hackerrank.prices.model.PriceResponse;
import com.hackerrank.prices.proxy.StocksClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OpenCloseService {

    private final StocksClient client;

    public String openAndClosePrices(final String firstDate, final String lastDate) {
        Integer page = 1;
        LocalDate fromDate = LocalDate.parse(firstDate, DateTimeFormatter.ofPattern("d-MMMM-yyyy"));
        LocalDate toDate = LocalDate.parse(lastDate, DateTimeFormatter.ofPattern("d-MMMM-yyyy"));
        List<PriceData> founds = new ArrayList<>();

        PriceResponse response = client.getStocks(page);
        Integer totalPages = response.getTotalPages();

        while (page < totalPages) {
            founds = response.getData().stream()
                    .filter(data -> data.getDate().isAfter(fromDate.minusDays(1)) &&
                            data.getDate().isBefore(toDate.plusDays(1)))
                    .collect(Collectors.toList());
            if (founds.isEmpty()) {
                page++;
                response = client.getStocks(page);
            } else {
                break;
            }
        }

        return founds.stream().map(f -> f.getDate().format(DateTimeFormatter.ofPattern("d-MMMM-yyyy"))
                .concat(" ").concat(f.getOpen().toString())
                .concat(" ").concat(f.getClose().toString()))
                .collect(Collectors.joining("\n"));

    }
}
