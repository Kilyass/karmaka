package Karmaka.Carte.Red;

import Karmaka.Carte.Carte;

public class Bassesse extends Carte {
    private static final String nom = "Bassesse";
    private static final String couleur = "Red";
    private static final String description = "Défaussez au hasard 2 cartes de la Main d’un rival.";

    private final int pt;

    public Bassesse() {
        super(3, nom, couleur, description);
        this.pt = 3;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
