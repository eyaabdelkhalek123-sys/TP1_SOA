package com.eya.film.service;

import com.eya.film.dto.APIResponseDto;
import com.eya.film.dto.FilmDto;

public interface FilmService {
    APIResponseDto getFilmById(Long id);
}
