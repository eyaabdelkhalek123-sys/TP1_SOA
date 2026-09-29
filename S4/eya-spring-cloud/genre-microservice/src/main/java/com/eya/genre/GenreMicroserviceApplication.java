package com.eya.genre;

import com.eya.genre.entities.Genre;
import com.eya.genre.repos.GenreRepository;
import org.bouncycastle.internal.asn1.gnu.GNUObjectIdentifiers;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GenreMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenreMicroserviceApplication.class, args); }

    @Bean
    CommandLineRunner commandLineRunner(GenreRepository genreRepository) {
        return args -> {
            genreRepository.save(Genre.builder()
                    .genName("Horror")
                    .genCode("HOR")
                    .build());
            genreRepository.save(Genre.builder()
                    .genName("Comedy")
                    .genCode("COM")
                    .build());
        };
    }
}
