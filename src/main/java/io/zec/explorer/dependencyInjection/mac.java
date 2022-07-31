package io.zec.explorer.dependencyInjection;

import io.zec.explorer.dependencyInjection.HDD.HardDisk;
import io.zec.explorer.dependencyInjection.OS.Os;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class mac implements Laptop {

    private final Os os;
    private final HardDisk hdd;

    public mac(@Qualifier("Arch") Os os, HardDisk hdd) {
        this.os = os;
        this.hdd = hdd;
    }

    @Override
    public void work() {
        os.start();
        hdd.writeData();

    }

    @Override
    public void play() {
        hdd.storeData();
        os.shutDown();
    }
}
