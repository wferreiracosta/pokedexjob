package br.com.wferreiracosta.pokedexjob.reader;

import br.com.wferreiracosta.pokedexjob.model.Pokemon;
import org.springframework.batch.item.json.JacksonJsonObjectReader;
import org.springframework.batch.item.json.JsonItemReader;
import org.springframework.batch.item.json.builder.JsonItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@Configuration
public class PokedexReaderConfig {

    @Bean
    public JsonItemReader<Pokemon> pokedexReader(
            @Value("#{jobParameters['arquivoPokemon']}") Resource arquivoPokemon
    ) {
        return new JsonItemReaderBuilder<Pokemon>()
                .name("pokedexReader")
                .jsonObjectReader(new JacksonJsonObjectReader<>(Pokemon.class))
                .resource(new FileSystemResource(arquivoPokemon.getFilename()))
                .build();
    }

}
