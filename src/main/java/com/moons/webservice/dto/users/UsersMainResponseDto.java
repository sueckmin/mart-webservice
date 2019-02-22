package com.moons.webservice.dto.users;

import com.moons.webservice.domain.users.Users;
import lombok.Getter;

@Getter
public class UsersMainResponseDto {
    private Long no;
    private String id;
    private String password;

    public UsersMainResponseDto(Users dto){
        this.no = dto.getNo();
        this.id = dto.getUserId();
        this.password = dto.getPassword();
    }

}
