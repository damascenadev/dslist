package com.devdamascena.dslist.controllers;

import com.devdamascena.dslist.dto.GameMinDto;
import com.devdamascena.dslist.entities.Game;
import com.devdamascena.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    public GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll() {
        List<GameMinDto> result = gameService.findALL();
        return result;
    }
}
