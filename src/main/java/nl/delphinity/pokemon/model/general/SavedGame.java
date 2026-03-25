package nl.delphinity.pokemon.model.general;

import java.io.Serializable;
import java.util.ArrayList;

public class SavedGame implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<Pokemon> pokemonCollection;

    public SavedGame(ArrayList<Pokemon> pokemonCollection) {
        this.pokemonCollection = pokemonCollection;
    }

    public ArrayList<Pokemon> getPokemonCollection() {
        return pokemonCollection;
    }

    @Override
    public String toString() {
        return "SavedGame{" +
                "pokemonCollection=" + pokemonCollection +
                '}';
    }
}
