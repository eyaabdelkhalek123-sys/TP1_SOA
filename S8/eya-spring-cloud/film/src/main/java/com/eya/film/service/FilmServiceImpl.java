package com.eya.film.service;


import com.eya.film.dto.APIResponseDto;
import com.eya.film.dto.FilmDto;
import com.eya.film.dto.GenreDto;
import com.eya.film.entities.Film;
import com.eya.film.repos.FilmRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class FilmServiceImpl implements FilmService {

    private FilmRepository filmRepository;

    //private WebClient webClient;

    private APIClient apiClient;

    @Override
    public APIResponseDto getFilmById(Long id) {
        Film film = filmRepository.findById(id).get();

        /*GenreDto genreDto = webClient.get()
                .uri("http://localhost:8060/api/genres/" +
                        film.getGenCode())
                .retrieve()
                .bodyToMono(GenreDto.class)
                .block();*/
        GenreDto genreDto = apiClient.getGenByCode(film.getGenCode());

        FilmDto filmDto =  new FilmDto(
                film.getId(),
                film.getTitle(),
                film.getLanguage(),
                film.getGenCode(),
                genreDto.getGenName()
        );



        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setFilmDto(filmDto);
        apiResponseDto.setGenreDto(genreDto);

        return apiResponseDto;
    }
}
