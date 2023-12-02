package Karmaka.Carte.Green;

import Karmaka.Carte.Carte;

public class Semis extends Carte {
    private static final String nom = "Semis";
    private static final String couleur = "Green";
    private static final String description = "Puisez 2 cartes à la Source, puis placez " +
            "sur votre Vie Future\n" +
            "2 cartes de votre Main.";
    private final int pt;

    public Semis() {
        super(2, nom, couleur, description);
        this.pt = 2;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
