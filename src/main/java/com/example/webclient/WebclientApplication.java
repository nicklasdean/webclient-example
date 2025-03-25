package com.example.webclient;

import com.example.webclient.DTO.CatFactDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class WebclientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(WebclientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        WebClient webClient = WebClient.create("https://catfact.ninja");

        Mono<CatFactDTO> catFactMono = webClient.get()
                .uri("/fact")
                .retrieve()
                .bodyToMono(CatFactDTO.class);

        CatFactDTO catFactResponse = catFactMono.block();
        System.out.println("Response: " + catFactResponse);
    }
}