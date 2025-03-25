package com.example.webclient.DTO;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CatFactDTO {
    private String fact;
    private int length;
}