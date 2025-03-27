package com.example.webclient.services;

import com.example.webclient.DTO.NumberDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RandomNumberService {

    private final WebClient webClient;

    public RandomNumberService() {
        // Base URL for the Random Number API
        this.webClient = WebClient.create("http://www.randomnumberapi.com");
    }

    public Mono<NumberDTO> getRandomNumber() {
        return webClient.get()
                .uri("/api/v1.0/random?min=1&max=10&count=1")
                .retrieve()
                .bodyToMono(Integer[].class)
                .map(array -> new NumberDTO(array[0]));
    }
}
