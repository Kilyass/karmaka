package Karmaka.Carte.Red;

import Karmaka.Carte.Carte;

public class Vengeance extends Carte {
    private static final String nom = "Vengeance";
    private static final String couleur = "Red";
    private static final String description = "Défaussez l’Oeuvre Exposée d’un rival.";

    private final int pt;

    public Vengeance() {
        super(3, nom, couleur, description);
        this.pt = 3;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
