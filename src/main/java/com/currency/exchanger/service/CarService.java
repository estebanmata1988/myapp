package com.currency.exchanger.service;

import com.currency.exchanger.entities.CarDetails;
import com.currency.exchanger.entities.CarForm;
import com.currency.exchanger.entities.Currency;
import com.currency.exchanger.entities.KernerEntity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Locale;


@Service
public class CarService {
    private WebClient client;

    public Mono<CarDetails> getNewCarCurrency(CarForm carForm) {
        this.client = WebClient.create("https://kerner.hyundai.com.ec");

        String carUri = "/api/versiones/ ", cryptoType;
        if (carForm.getModel().toLowerCase().equals("accent"))
            carUri += "1/1036";
        else if (carForm.getModel().toLowerCase().equals("tucson"))
            carUri += "1/1031";
        else carUri += "1/1023";

        if (carForm.getCriptoCurrency().toLowerCase().equals("btc"))
            cryptoType = "/BTC";
        if (carForm.getCriptoCurrency().toLowerCase().equals("eth"))
            cryptoType = "/ETH";
        else
            return Mono.empty();

        Flux<KernerEntity> kernerEntityFlux = this.client
                .get()
                .uri(carUri).accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(KernerEntity.class);

        this.client = WebClient.create("https://http-api.livecoinwatch.com/coins");

        Mono<Currency> currencyMono = this.client
                .get()
                .uri(cryptoType + "/about?currency=USD").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Currency.class);
        return Mono.empty();
    }

    public Mono<CarDetails> buyNewCar(CarForm carForm)
    {
        return Mono.empty();
    }

    public Mono<CarDetails> getReport(CarForm carForm)
    {
        return Mono.empty();
    }

}
