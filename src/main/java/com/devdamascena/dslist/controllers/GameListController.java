package com.devdamascena.dslist.controllers;


import com.devdamascena.dslist.dto.GameListDto;
import com.devdamascena.dslist.dto.GameMinDto;
import com.devdamascena.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

    @Autowired
    public GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll() {
        List<GameListDto> result = gameListService.findALL();
        return result;
    }
}
