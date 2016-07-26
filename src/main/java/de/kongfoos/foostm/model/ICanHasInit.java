package de.kongfoos.foostm.model;

import javax.annotation.PostConstruct;

public interface ICanHasInit {
    @PostConstruct
    void init();
}
