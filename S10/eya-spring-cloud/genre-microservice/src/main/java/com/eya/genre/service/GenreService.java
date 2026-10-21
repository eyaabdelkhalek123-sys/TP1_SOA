package com.eya.genre.service;


import com.eya.genre.dto.GenreDto;

public interface GenreService {
    GenreDto getGenreByCode(String code);
}