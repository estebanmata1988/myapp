package com.currency.exchanger.entities;


import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarDetails {
    private @Id
    @Setter(AccessLevel.PROTECTED) Long id;
    private String conversionId;
    private String conversionTimeLife;
    private List<CarVersion> versions;
    private String fullName;
    private String date;
    private String purchaseId;
    private CarVersion version;
    private String usdAmount;
}
