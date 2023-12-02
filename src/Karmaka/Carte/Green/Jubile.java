package Karmaka.Carte.Green;

import Karmaka.Carte.Carte;

public class Jubile extends Carte {
    private static final String nom = "Jubile";
    private static final String couleur = "Green";
    private static final String description = "Placez jusqu’à 2 cartes de votre " +
            "Main sur vos Oeuvres.";
    private final int pt;

    public Jubile() {
        super(3, nom, couleur, description);
        this.pt = 3;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
