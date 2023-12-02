package Karmaka.Carte.Green;

import Karmaka.Carte.Carte;

public class Longevite extends Carte {
    private static final String nom = "Longevite";
    private static final String couleur = "Green";
    private static final String description = "Placez 2 cartes puisées à la Source " +
            "sur la Pile d'un joueur.";
    private final int pt;

    public Longevite() {
        super(2, nom, couleur, description);
        this.pt = 2;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
