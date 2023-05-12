package com.devdamascena.dslist.controllers;


import com.devdamascena.dslist.dto.GameListDto;
import com.devdamascena.dslist.dto.GameMinDto;
import com.devdamascena.dslist.services.GameListService;
import com.devdamascena.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

    @Autowired
    public GameListService gameListService;

    @Autowired
    public GameService gameService;

    @GetMapping
    public List<GameListDto> findAll() {
        List<GameListDto> result = gameListService.findALL();
        return result;
    }

    @GetMapping(value = "/{listId}/games" )
    public List<GameMinDto> findBylist(@PathVariable Long listId) {
        List<GameMinDto> result = gameService.findBylist(listId);
        return result;
    }

}
