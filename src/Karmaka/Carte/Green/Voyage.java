package Karmaka.Carte.Green;

import Karmaka.Carte.Carte;

public class Voyage extends Carte {
    private static final String nom = "Voyage";
    private static final String couleur = "Green";
    private static final String description = "Puisez 3 cartes à la Source.\n" +
            "Vous pouvez ensuite jouer une autre carte.";
    private final int pt;

    public Voyage() {
        super(3, nom, couleur, description);
        this.pt = 3;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
