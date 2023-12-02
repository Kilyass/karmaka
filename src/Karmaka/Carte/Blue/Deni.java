package Karmaka.Carte.Blue;

import Karmaka.Carte.Carte;

public class Deni extends Carte {
    private static final String nom = "Rêves Brisés";
    private static final String couleur = "blue";
    private static final String description = "Défaussez une carte de votre Main.\n " +
            "Copiez le pouvoir de cette carte.";
    private final int pt;

    public Deni() {
        super(2, nom, couleur, description);
        this.pt = 2;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
