package com.example.webclient.services;

import com.example.webclient.DTO.NumberDTO;
import com.example.webclient.DTO.StarWarsCharacterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RandomStarWarsService {
    private final RandomNumberService randomNumberService;
    private final WebClient webClient;

    public RandomStarWarsService(RandomNumberService randomNumberService){
        this.randomNumberService = randomNumberService;
        this.webClient = WebClient.create("https://swapi.dev/api/");
    }

    public Mono<StarWarsCharacterDTO> getRandomCharacter(){
        Mono<NumberDTO> randomNumber = randomNumberService.getRandomNumber();

        return randomNumber.flatMap(number ->
            webClient.get()
                    .uri("people/" + String.valueOf(number.getNumber()))
                    .retrieve()
                    .bodyToMono(StarWarsCharacterDTO.class)

        );
    }
}
