import org.junit.jupiter.api.Test;
import org.peli.Pelaaja;

import static org.junit.jupiter.api.Assertions.*;

public class PelaajaTest {
    @Test
    void testValitse() {
        Pelaaja pelaaja = new Pelaaja();
        String valinta = pelaaja.valitse();
        assertNotNull(valinta);
        assertTrue(valinta.equals("kivi") || valinta.equals("paperi") || valinta.equals("sakset"));
    }

    @Test
    void testTarkistaVoitto() {
        Pelaaja pelaaja = new Pelaaja();
        assertTrue(pelaaja.tarkistaVoitto("kivi", "sakset"));
        assertFalse(pelaaja.tarkistaVoitto("kivi", "paperi"));
        assertFalse(pelaaja.tarkistaVoitto("kivi", "kivi"));
    }
}