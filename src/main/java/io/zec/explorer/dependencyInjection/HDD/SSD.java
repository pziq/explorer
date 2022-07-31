package io.zec.explorer.dependencyInjection.HDD;

import io.zec.explorer.dependencyInjection.HDD.HardDisk;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class SSD implements HardDisk {

    @Override
    public void storeData() {
        log.info("Storing Data");
    }

    @Override
    public void writeData() {
        log.info("writing Data");
    }
}
