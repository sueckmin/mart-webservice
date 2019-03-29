package com.moons.webservice.dto.titles;

import com.moons.webservice.domain.posts.Posts;
import com.moons.webservice.domain.titles.Titles;
import lombok.Builder;

public class TitlesSaveRequestDto {
    private Long id;
    private String title;
    private String author;

    @Builder
    public TitlesSaveRequestDto(Posts posts){
        this.id = posts.getId();
        this.title = posts.getTitle();
        this.author = posts.getAuthor();
    }

    public Titles toEntity(){
        return Titles.builder()
                .id(id)
                .title(title)
                .author(author)
                .build();
    }

}
