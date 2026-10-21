package com.eya.film;

import com.eya.film.entities.Film;
import com.eya.film.repos.FilmRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@EnableFeignClients
@SpringBootApplication
public class FilmApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmApplication.class, args);
	}

	@Bean
    CommandLineRunner commandLineRunner(FilmRepository filmRepository) {
		return args -> {
			filmRepository.save(Film.builder()
					.title("The fin")
					.language("korean")
					.genCode("HOR")
					.build());

		};
	}

	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}
}
