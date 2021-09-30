package com.hackerrank.prices.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PriceResponse {

    private Integer page;

    @JsonAlias("per_page")
    private Integer perPage;

    private Integer total;

    @JsonAlias("total_pages")
    private Integer totalPages;

    private List<PriceData> data;

    @JsonCreator
    public PriceResponse(Integer page, @JsonProperty("per_page") Integer perPage, Integer total, @JsonProperty("total_pages") Integer totalPages, List<PriceData> data) {
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
        this.data = data;
    }
}
