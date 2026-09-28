package com.eya.film.repos;

import com.eya.film.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository  extends JpaRepository<Film, Long> {

}