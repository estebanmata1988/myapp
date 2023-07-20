package com.currency.exchanger.entities;

import lombok.*;
import lombok.extern.jackson.Jacksonized;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@Jacksonized
public class Currency {

    private String lastPrice;
    private String price_usd;
}
