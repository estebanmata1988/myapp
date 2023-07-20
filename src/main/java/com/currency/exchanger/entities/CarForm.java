package com.currency.exchanger.entities;

import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class CarForm implements Serializable {
    private @Id
    @Setter(AccessLevel.PROTECTED) Long id;
    private String model;
    private String criptoCurrency;
    private String conversionId;
    private String fullName;
    private String version;
    private String date;
}
