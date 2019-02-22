package com.moons.webservice.domain.users;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@IdClass(UsersPk.class)
public class Users {

    @Id
    @Column(name = "user_number")
    @GeneratedValue
    private Long no;

    @Id
    @Column(name = "user_zz")
    private String userId;

    @Column(name = "user_password")
    private String password;

    @Builder
    public Users(String userId, String password){
        this.userId = userId;
        this.password = password;
    }

}
