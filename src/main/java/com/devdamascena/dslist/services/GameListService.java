package com.devdamascena.dslist.services;

import com.devdamascena.dslist.dto.GameListDto;
import com.devdamascena.dslist.entities.GameList;
import com.devdamascena.dslist.projections.GameMinProjection;
import com.devdamascena.dslist.repositories.GameListRepository;
import com.devdamascena.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    public GameListRepository gameListRepository;

    @Autowired
    public GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findALL() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDto> dto = result.stream().map(x -> new GameListDto(x)).toList();
        return dto;

    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {

        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for(int i = min; i <= max ; i++  ) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(),i);
        }
    }
}
