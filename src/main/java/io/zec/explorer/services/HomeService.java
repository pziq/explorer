package io.zec.explorer.services;

import io.zec.explorer.rnd.dependencyInjection.model.Aliens;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class HomeService {

    private final Aliens aliens;

    public HomeService(Aliens aliens) {
        this.aliens = aliens;
    }

    public Aliens addAlien(){
        aliens.setName("samin");
        aliens.setPlanet("Earth");
        aliens.setSector(256);
        return aliens;
    }
}
