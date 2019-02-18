package com.moons.webservice.service;

import com.moons.webservice.domain.Emps.EmpRepository;
import com.moons.webservice.dto.Emps.EmpMainResponseDto;
import com.moons.webservice.dto.Emps.EmpSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class EmpService {

    private EmpRepository empRepository;

    @Transactional
    public String save(EmpSaveRequestDto dto) {
        return empRepository.save(dto.toEntity()).getName();
    }

    @Transactional
    public List<EmpMainResponseDto> findAllDesc(){
        return empRepository.findAllDesc()
                .map(EmpMainResponseDto::new)
                .collect(Collectors.toList());
    }


}
