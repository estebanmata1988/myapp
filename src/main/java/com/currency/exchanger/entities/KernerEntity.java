package com.currency.exchanger.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Id;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@Jacksonized
public class KernerEntity {
    private @Id
    @Setter(AccessLevel.PROTECTED) Long id;
    @JsonProperty
    private String VER_NOMBRE;
    private String VEA_PRECIO_FINAL;
}
