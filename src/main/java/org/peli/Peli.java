package org.peli;

/**
 *
 * @author Ira Dook
 */
/**
 * Kivi sakset paperi pelin logiikka
 */
public class Peli {
    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;
    private int tasapelit;

    /**
     * Luo uuden pelin annetuille pelaajille.
     *
     * @param pelaaja1 Ensimmäinen pelaaja
     * @param pelaaja2 Toinen pelaaja
     */
    public Peli(Pelaaja pelaaja1, Pelaaja pelaaja2) {
        this.pelaaja1 = pelaaja1;
        this.pelaaja2 = pelaaja2;
        this.tasapelit = 0;
    }

    /**
     * Aloittaa pelin joka jatkuu kunnes jompikumpi pelaaja saavuttaa 3 voittoa.
     * Tulostaa myös jokaisen kierroksen tulokset.
     */
    public void pelaa() {
        while (pelaaja1.getVoitot() < 3 && pelaaja2.getVoitot() < 3) {
            String valintaP1 = pelaaja1.valitse();
            String valintaP2 = pelaaja2.valitse();

            System.out.println("Pelaaja 1 valitsi: " + valintaP1);
            System.out.println("Pelaaja 2 valitsi: " + valintaP2);

            if (valintaP1.equals(valintaP2)) {
                tasapelit++;
                System.out.println("Tasapeli!");
            } else if (pelaaja1.tarkistaVoitto(valintaP1, valintaP2)) {
                pelaaja1.lisaaVoitto();
                System.out.println("Pelaaja 1 voittaa!");
            } else {
                pelaaja2.lisaaVoitto();
                System.out.println("Pelaaja 2 voittaa!");
            }

            System.out.println("Voittoja yhteensä:");
            System.out.println("Pelaaja 1: " + pelaaja1.getVoitot());
            System.out.println("Pelaaja 2: " + pelaaja2.getVoitot());
            System.out.println("Tasapelit: " + tasapelit + "\n");
        }

        System.out.println("Peli päättyi!");
    }
}