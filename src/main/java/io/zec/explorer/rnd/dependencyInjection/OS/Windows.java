package io.zec.explorer.rnd.dependencyInjection.OS;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@Qualifier("Windows")
public class Windows implements Os{

    @Override
    public void start() {

        log.info("starting windows");

    }

    @Override
    public void shutDown() {

        log.info("shutting down windows");

    }
}
