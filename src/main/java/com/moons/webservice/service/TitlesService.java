package com.moons.webservice.service;

import com.moons.webservice.domain.titles.Titles;
import com.moons.webservice.domain.titles.TitlesRepository;
import com.moons.webservice.dto.posts.PostsMainResponseDto;
import com.moons.webservice.dto.titles.TitlesMainResponseDto;
import com.moons.webservice.dto.titles.TitlesSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class TitlesService {

    private TitlesRepository titlesRepository;

    @Transactional
    public Long save(TitlesSaveRequestDto dto){
        return titlesRepository.save(dto.toEntity()).getId();
    }

    @Transactional
    public Page<Titles> findAllDescId(Pageable pageable) {
        return titlesRepository.findAll(pageable);
    }

    @Transactional
    public int update(Long id, String title) {
        return titlesRepository.update(id, title);
    }




    /*
    @Transactional
    public List<TitlesMainResponseDto> findAllDesc() {
        return titlesRepository.findAllDesc()
                .map(TitlesMainResponseDto::new)
                .collect(Collectors.toList());
    }
    */

}
