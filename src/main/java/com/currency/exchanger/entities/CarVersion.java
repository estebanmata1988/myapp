package com.currency.exchanger.entities;

import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarVersion {
    private @Id
    @Setter(AccessLevel.PROTECTED) Long id;
    private String model;
    private String version;
    private String priceUsd;
    private String priceCryptoCurrency;
    private String cryptoCurrency;
}
