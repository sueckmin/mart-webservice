package com.moons.webservice.web;

import com.moons.webservice.domain.etls.EtlsRepository;
import com.moons.webservice.domain.members.Member;
import com.moons.webservice.domain.members.MemberRepository;
import com.moons.webservice.domain.members.MemberRole;
import com.moons.webservice.domain.posts.PostsRepository;
import com.moons.webservice.dto.Emps.EmpSaveRequestDto;
import com.moons.webservice.dto.etls.EtlsSaveRequestDto;
import com.moons.webservice.dto.posts.PostsSaveRequestDto;
import com.moons.webservice.dto.users.UsersSaveRequestDto;
import com.moons.webservice.service.EmpService;
import com.moons.webservice.service.EtlsService;
import com.moons.webservice.service.PostsService;
import com.moons.webservice.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;
    private PostsRepository postsRepository;
    private EtlsService etlsService;
    private EtlsRepository etlsRepository;
    private EmpService empService;
    private UsersService usersService;
    private MemberRepository memberRepository;

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld!";
    }

    @PostMapping("/member")
    public String create(@RequestBody Member member){
        MemberRole role = new MemberRole();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        member.setUpw(passwordEncoder.encode(member.getUpw()));
        role.setRoleName("USER");
        member.setRoles(Arrays.asList(role));
        memberRepository.save(member);
        return "redirect:/";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }

    @PostMapping("/etls")
    public Long saveEtls(@RequestBody EtlsSaveRequestDto dto){
        return etlsService.save(dto);
    }

    @PostMapping("/emp")
    public String saveEmp(@RequestBody EmpSaveRequestDto dto){ return empService.save(dto);}

    @PostMapping("/users")
    public Long saveUsers(@RequestBody UsersSaveRequestDto dto){return usersService.save(dto);}


}
