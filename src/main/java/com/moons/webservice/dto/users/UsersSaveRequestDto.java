package com.moons.webservice.dto.users;

import com.moons.webservice.domain.users.Users;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UsersSaveRequestDto {
    private String id;
    private String password;

    @Builder
    public UsersSaveRequestDto(String id, String password){
        this.id = id;
        this.password = password;
    }

    public Users toEntity(){
        return Users.builder()
                .userId(id)
                .password(password)
                .build();
    }
}
