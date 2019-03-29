package com.moons.webservice.web;

import com.moons.webservice.domain.titles.Titles;
import com.moons.webservice.service.PostsService;
import com.moons.webservice.service.TitlesService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@AllArgsConstructor
public class WebController {

    private PostsService postsService;
    private TitlesService titlesService;

    @GetMapping("/")
    public String main(Model model,
                       @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 5) Pageable pageable) {
        Page<Titles> titlesPage = titlesService.findAllDescId(pageable);

        model.addAttribute("titles", titlesPage.getContent());
        model.addAttribute("totalPage",titlesPage.getTotalPages());
        model.addAttribute("currntPage",titlesPage.getNumber()+1);
        return "/main";
    }

    @GetMapping("/posts/{id}")
    public String kkk(Model model, @PathVariable("id") Long id){
        postsService.view(id);
        model.addAttribute("posts",postsService.findById(id));
        return "/posts/posts";
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

    @GetMapping("moons")
    public String moons(){
        return "test";
    }

}
