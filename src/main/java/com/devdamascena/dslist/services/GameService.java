package com.devdamascena.dslist.services;

import com.devdamascena.dslist.dto.GameMinDto;
import com.devdamascena.dslist.entities.Game;
import com.devdamascena.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    public GameRepository gameRepository;

    public List<GameMinDto> findALL() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
        return dto;

    }
}
