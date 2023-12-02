package Karmaka.Carte.Green;

import Karmaka.Carte.Carte;

public class Recyclage extends Carte {
    private static final String nom = "Recyclage";
    private static final String couleur = "Green";
    private static final String description = "Ajoutez à votre Vie Future une des " +
            "3 dernières cartes de la Fosse.";
    private final int pt;

    public Recyclage() {
        super(1, nom, couleur, description);
        this.pt = 1;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
