package com.devdamascena.dslist.services;

import com.devdamascena.dslist.dto.GameListDto;
import com.devdamascena.dslist.entities.GameList;
import com.devdamascena.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    public GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findALL() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDto> dto = result.stream().map(x -> new GameListDto(x)).toList();
        return dto;

    }
}
