package io.zec.explorer.rnd.dependencyInjection.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Component
public class Aliens {

    private String name;
    private String planet;
    private Integer sector;

}
