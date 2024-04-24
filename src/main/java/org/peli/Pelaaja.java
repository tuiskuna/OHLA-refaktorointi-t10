
package org.peli;

/**
 *
 * @author Tuisku Närhi
 */

import java.util.Random;
/**
 * Peliin osallistuva pelaaja.
 */
public class Pelaaja {
    //Taulukko eri vaihtoehdoille
    private static final String[] VAIHTOEHDOT = {"kivi", "paperi", "sakset"};
    private static final Random random = new Random();
    private int voitot;

    /**
     * Valitsee satunnaisesti kiven, paperin tai sakset. arpomalla numeron ja palauttamalla arvottua numeroa vastaavan vaihtoehdon taulukosta.
     *
     * @return Pelaajan valinta (kivi, paperi tai sakset)
     */
    public String valitse() {
        //ar
        int indeksi = random.nextInt(VAIHTOEHDOT.length);
        return VAIHTOEHDOT[indeksi];
    }

    /**
     * Palauttaa pelaajan voittojen lukumäärän.
     *
     * @return Voittojen lukumäärä
     */
    public int getVoitot() {
        return voitot;
    }

    /**
     * Lisää pelaajan voittojen lukumäärää yhdellä.
     */
    public void lisaaVoitto() {
        voitot++;
    }
    /**
     * Tarkistaa, voittaako pelaaja annetun vastustajan valinnan perusteella.
     *
     * @param pelaajanValinta   Pelaajan valinta (kivi, paperi tai sakset)
     * @param vastustajanValinta Vastustajan valinta (kivi, paperi tai sakset)
     * @return true jos pelaaja voittaa, muuten false
     */
    public boolean tarkistaVoitto(String pelaajanValinta, String vastustajanValinta) {
        return (pelaajanValinta.equals("kivi") && vastustajanValinta.equals("sakset")) ||
                (pelaajanValinta.equals("paperi") && vastustajanValinta.equals("kivi")) ||
                (pelaajanValinta.equals("sakset") && vastustajanValinta.equals("paperi"));
    }
}
