package com.example.webclient.controllers;

import com.example.webclient.DTO.NumberDTO;
import com.example.webclient.DTO.StarWarsCharacterDTO;
import com.example.webclient.services.RandomNumberService;
import com.example.webclient.services.RandomStarWarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class NumberController {
    private final RandomNumberService randomNumberService;
    private final RandomStarWarsService randomStarWarsService;
    public NumberController(RandomNumberService randomNumberService, RandomStarWarsService randomStarWarsService){
        this.randomNumberService = randomNumberService;
        this.randomStarWarsService = randomStarWarsService;
    }
    @GetMapping("/number")
    public Mono<NumberDTO> getNumber(){
        return randomNumberService.getRandomNumber();
    }

    @GetMapping("/sw")
    public Mono<StarWarsCharacterDTO> getChar(){
        return randomStarWarsService.getRandomCharacter();
    }
}
