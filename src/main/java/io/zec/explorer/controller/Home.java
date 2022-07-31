package io.zec.explorer.controller;

import io.zec.explorer.services.HomeService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class Home {
    private final HomeService homeService;

    public Home(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping(name = "/home")
    public String hello(){
        log.info("inside hello controller");
        return "home";
    }

}
