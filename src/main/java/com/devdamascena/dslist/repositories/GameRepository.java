package com.devdamascena.dslist.repositories;

import com.devdamascena.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
