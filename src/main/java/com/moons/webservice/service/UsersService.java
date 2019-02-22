package com.moons.webservice.service;

import com.moons.webservice.domain.users.UsersRepository;
import com.moons.webservice.dto.users.UsersMainResponseDto;
import com.moons.webservice.dto.users.UsersSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class UsersService {

    private UsersRepository usersRepository;

    @Transactional
    public Long save(UsersSaveRequestDto dto){
        return usersRepository.save(dto.toEntity()).getNo();
    }

    @Transactional
    public List<UsersMainResponseDto> findAllDesc(){
        return usersRepository.findAllDesc()
                .map(UsersMainResponseDto::new)
                .collect(Collectors.toList());

    }

}
