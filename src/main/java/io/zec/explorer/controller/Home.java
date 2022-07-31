package io.zec.explorer.controller;

import io.zec.explorer.dependencyInjection.Laptop;
import io.zec.explorer.model.Aliens;
import io.zec.explorer.services.HomeService;
import lombok.extern.log4j.Log4j2;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class Home {
    private final HomeService homeService;

    public Home(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping
    public String hello(Model model){
        log.info("inside hello controller");
        model.addAttribute("alien","abc");
        return "home";
    }

}
