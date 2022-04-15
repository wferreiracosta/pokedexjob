package br.com.wferreiracosta.pokedexjob.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pokemon {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private Name name;

}
