
package com.example.webclient.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StarWarsCharacterDTO {
    @JsonProperty("name")
    private String name;

    @JsonProperty("height")
    private String height;

    @JsonProperty("mass")
    private String mass;

    @JsonProperty("hair_color") // Changing the JSON response name to a Java convention name
    private String hairColor;

    @JsonProperty("skin_color") // Changing the JSON response name to a Java convention name
    private String skinColor;

    @JsonProperty("eye_color") // Changing the JSON response name to a Java convention name
    private String eyeColor;

    @JsonProperty("birth_year") // Changing the JSON response name to a Java convention name
    private String birthYear;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("homeworld")
    private String homeworld;

    @JsonProperty("films")
    private List<String> films;

    @JsonProperty("species")
    private List<String> species;

    @JsonProperty("vehicles")
    private List<String> vehicles;

    @JsonProperty("starships")
    private List<String> starships;

    @JsonProperty("created")
    private String created;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("url")
    private String url;
}
