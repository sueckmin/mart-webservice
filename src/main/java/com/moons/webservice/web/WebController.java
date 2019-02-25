package com.moons.webservice.web;

import com.moons.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {

    private PostsService postsService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "/main";
    }

    @GetMapping("/member")
    public String member(){
        return "/sign";
    }

    @GetMapping("/login")
    public String login(){
        return "sign";
    }

    @GetMapping("/test")
    public String test() {
        return "/test/test";
    }

    @GetMapping("/testpage")
    public String testpage() {
        return "/test/testpage";
    }


}
