package com.moons.webservice.dto.titles;

import com.moons.webservice.domain.posts.Posts;
import com.moons.webservice.domain.titles.Titles;
import lombok.Getter;

@Getter
public class TitlesMainResponseDto {
    private Long id;
    private String title;
    private String author;

    public TitlesMainResponseDto(Titles entity){
        id = entity.getId();
        title = entity.getTitle();
        author = entity.getAuthor();
    }

    /*
    public TitlesMainResponseDto(Posts entity){
        id = entity.getId();
        title = entity.getTitle();
        author = entity.getAuthor();
    }
    */
}
