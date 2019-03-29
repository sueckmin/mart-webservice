package com.moons.webservice.service;

import com.moons.webservice.domain.posts.Posts;
import com.moons.webservice.domain.posts.PostsRepository;
import com.moons.webservice.dto.posts.PostsMainResponseDto;
import com.moons.webservice.dto.posts.PostsSaveRequestDto;
import com.moons.webservice.dto.titles.TitlesSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;
    private TitlesService titlesService;
    @Transactional
    public Long save(PostsSaveRequestDto dto) {
        return postsRepository.save(dto.toEntity()).getId();
    }


    @Transactional
    public Long save2(PostsSaveRequestDto dto){
        Long no = save(dto);
        Posts posts = postsRepository.findById(no);
        return titlesService.save(new TitlesSaveRequestDto(posts));
    }

    /*
    @Transactional
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsMainResponseDto::new)
                .collect(Collectors.toList());
    }
    */
    @Transactional
    public Posts findById(Long id){
        return postsRepository.findById(id);
    }


    @Transactional
    public int update(Long id, String title, String content){
        int _result = postsRepository.update(id,title,content);
        int __result = titlesService.update(id,title);
        return __result + _result;
    }

    @Transactional
    public void view(Long id){
        postsRepository.view(id);
    }


}
