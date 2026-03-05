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
        // PokemonData data = PokemonData.PIKACHU;
        PokemonData charmander = PokemonData.CHARMANDER;
        
        pokemon = new Pokemon(charmander);
    }

    @Test
    public void testIsNotKnockoutOnStart() {
        assertFalse(pokemon.isKnockout());
    }
    
    @Test
    public void testIsCharmanderLevelFive() {
        assertEquals(pokemon.getLevel(), 5);
    }

    @Test
    public void testIsPokemonCanEvolve() {
    	assertEquals(PokemonData.CHARMANDER.evolvesIn, PokemonData.CHARMELEON);
    	assertEquals(PokemonData.CHARMELEON.evolvesIn, PokemonData.CHARIZARD);
    	assertEquals(PokemonData.IVYSAUR.evolvesIn, PokemonData.VENUSAUR);
    }
}