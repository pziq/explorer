package io.zec.explorer.dependencyInjection.OS;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@Qualifier("Arch")
public class ArchLinux implements Os {

    @Override
    public void start() {
        log.info("starting arch linux");
    }

    @Override
    public void shutDown() {
        log.warn("shutting down arch...");
    }
}
