package com.example.webclient.services;

import com.example.webclient.DTO.CatFactDTO;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class CatFactService {
    private WebClient webClient = WebClient.create("https://catfact.ninja");

    public Mono<CatFactDTO> fetchSingleCatfact(){

        return  webClient.get()
                .uri("/fact")
                .retrieve()
                .bodyToMono(CatFactDTO.class);
    }
}
