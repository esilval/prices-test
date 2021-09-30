package com.hackerrank.prices.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceData {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "d-MMMM-yyyy")
    private LocalDate date;

    private Double open;

    private Double close;

    private Double high;

    private Double low;

}
