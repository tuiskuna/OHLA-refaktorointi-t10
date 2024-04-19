
package org.peli;

/**
 *
 * @author Tuisku Närhi
 */
/**
 * Peliin osallistuva pelaaja.
 */
public class Pelaaja {
    private int voitot;

    /**
     * Valitsee satunnaisesti kiven, paperin tai sakset.
     *
     * @return Pelaajan valinta (kivi, paperi tai sakset)
     */
    public String valitse() {
        int valinta = (int) (Math.random() * 3);
        return switch (valinta) {
            case 0 -> "kivi";
            case 1 -> "paperi";
            case 2 -> "sakset";
            default -> "";
        };
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
