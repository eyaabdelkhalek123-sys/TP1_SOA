package com.eya.film.restControllers;

import com.eya.film.config.Configuration;
import com.eya.film.dto.APIResponseDto;
import com.eya.film.dto.FilmDto;
import com.eya.film.service.FilmService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/films")
@RequiredArgsConstructor
public class FilmController {

    @Autowired
    Configuration configuration;

    private FilmService filmsService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getFilmById(@PathVariable("id") Long id )
    {
        return  new ResponseEntity<APIResponseDto>(filmsService.getFilmById(id), HttpStatus.OK);
    }

    @GetMapping("/author")
    public  ResponseEntity<String> retrieveAuthorInfo() {
        return
                ResponseEntity.status(HttpStatus.OK)
                        .body(configuration.getName()+" "+configuration.getEmail() );
    }
}
