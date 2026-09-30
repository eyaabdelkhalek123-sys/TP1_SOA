package com.eya.genre.repos;

import com.eya.genre.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository  extends JpaRepository<Genre,Long> {
    Genre findByGenCode(String code);
}