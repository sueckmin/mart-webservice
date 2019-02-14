package com.moons.webservice.service;

import com.moons.webservice.domain.etls.EtlsRepository;
import com.moons.webservice.dto.etls.EtlsMainResponseDto;
import com.moons.webservice.dto.etls.EtlsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class EtlsService {
    private EtlsRepository etlsRepository;

    @Transactional
    public Long save(EtlsSaveRequestDto dto){
        return etlsRepository.save(dto.toEntity()).getId().getId();
    }

    @Transactional
    public List<EtlsMainResponseDto> findAllDesc(){
        return etlsRepository.findAllDesc()
                .map(EtlsMainResponseDto::new)
                .collect(Collectors.toList());
    }

}
