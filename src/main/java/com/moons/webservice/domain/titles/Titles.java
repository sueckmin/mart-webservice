package com.moons.webservice.domain.titles;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Titles {

    @Id
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    private String author;

    @Builder
    public Titles(Long id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
