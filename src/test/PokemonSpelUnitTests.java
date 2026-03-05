import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import nl.delphinity.pokemon.model.general.Pokemon;
import nl.delphinity.pokemon.model.general.PokemonData;

public class PokemonSpelUnitTests {

    private Pokemon pokemon;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        PokemonData data = PokemonData.PIKACHU;
        pokemon = new Pokemon(data);
    }

    @Test
    public void testIsNotKnockoutOnStart() {
        assertFalse(pokemon.isKnockout());
    }

}