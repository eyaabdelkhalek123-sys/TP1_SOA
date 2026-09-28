package com.eya.film.service;

import com.eya.film.dto.GenreDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8060", value = "GENRE")
public interface APIClient {
    @GetMapping("api/genres/{genre-code}")
    GenreDto getGenByCode(@PathVariable("genre-code") String genreCode);
}