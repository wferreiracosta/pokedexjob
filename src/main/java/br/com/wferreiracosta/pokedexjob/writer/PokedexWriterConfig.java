package br.com.wferreiracosta.pokedexjob.writer;

import br.com.wferreiracosta.pokedexjob.model.Pokemon;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PokedexWriterConfig {

    @Bean
    public ItemWriter<Pokemon> pokedexWriter() {
        return items -> items.forEach(System.out::println);
    }

}
