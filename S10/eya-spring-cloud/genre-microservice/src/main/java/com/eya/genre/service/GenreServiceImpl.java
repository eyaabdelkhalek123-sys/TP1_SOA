package com.eya.genre.service;

import com.eya.genre.dto.GenreDto;
import com.eya.genre.entities.Genre;
import com.eya.genre.repos.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl implements GenreService {
    @Autowired
    GenreRepository genreRepository;

    @Override
    public GenreDto getGenreByCode(String code) {
        Genre gen = genreRepository.findByGenCode(code);
        GenreDto genreDto = new GenreDto(
                gen.getId(),
                gen.getGenName(),
                gen.getGenCode()
        );

        return genreDto;
    }
}