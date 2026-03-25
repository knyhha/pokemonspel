package nl.delphinity.pokemon.model.trainer;

import java.io.Serializable;

public class Badge implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String name;

    public Badge(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
