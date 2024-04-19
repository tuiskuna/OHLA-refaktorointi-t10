
import org.junit.jupiter.api.Test;
import org.peli.Pelaaja;
import org.peli.Peli;

import static org.junit.jupiter.api.Assertions.*;

public class PeliTest {
    @Test
    void testPelaa() {
        Pelaaja pelaaja1 = new Pelaaja();
        Pelaaja pelaaja2 = new Pelaaja();

        Peli peli = new Peli(pelaaja1, pelaaja2);

        peli.pelaa();

        assertTrue(pelaaja1.getVoitot() == 3 || pelaaja2.getVoitot() == 3);
    }
}
