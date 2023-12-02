package Karmaka.Carte.Green;

import Karmaka.Carte.Carte;

public class Sauvetage extends Carte {
    private static final String nom = "Sauvetage";
    private static final String couleur = "Green";
    private static final String description = "Ajoutez à votre Main une des 3 dernières " +
            "cartes de la Fosse.";
    private final int pt;

    public Sauvetage() {
        super(2, nom, couleur, description);
        this.pt = 2;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
