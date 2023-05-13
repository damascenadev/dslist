package com.devdamascena.dslist.dto;

import com.devdamascena.dslist.entities.Game;
import com.devdamascena.dslist.projections.GameMinProjection;

public class GameMinDto {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto(){

    }

    public GameMinDto(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDto(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public long getId() {

        return id;
    }

    public String getTitle() {

        return title;
    }

    public Integer getYear() {

        return year;
    }

    public String getImgUrl() {

        return imgUrl;
    }

    public String getShortDescription() {

        return shortDescription;
    }
}
