package br.com.wferreiracosta.pokedexjob.step;

import br.com.wferreiracosta.pokedexjob.model.Pokemon;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PokedexStepConfig {

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step pokedexStep(ItemReader<Pokemon> pokedexReader, ItemWriter<Pokemon> pokedexWriter){
        return stepBuilderFactory
                .get("pokedexStep")
                .<Pokemon, Pokemon>chunk(1)
                .reader(pokedexReader)
                .writer(pokedexWriter)
                .build();
    }

}
