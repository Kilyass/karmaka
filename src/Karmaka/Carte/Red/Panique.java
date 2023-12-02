package Karmaka.Carte.Red;

import Karmaka.Carte.Carte;

public class Panique extends Carte {
    private static final String nom = " Panique";
    private static final String couleur = "Red";
    private static final String description = "Défaussez la première carte de la " +
            "Pile d'un joueur.\n" +
            "Vous pouvez ensuite jouer une autre carte.";

    private final int pt;

    public Panique() {
        super(1, nom, couleur, description);
        this.pt = 1;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
