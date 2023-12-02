package Karmaka.Carte.Green;

import Karmaka.Carte.Carte;

public class Lendemain extends Carte {
    private static final String nom = "Lendemain";
    private static final String couleur = "Green";
    private static final String description = "Puisez une carte à la Source.\n" +
            "Vous pouvez ensuite jouer une autre carte.";
    private final int pt;

    public Lendemain() {
        super(1, nom, couleur, description);
        this.pt = 1;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
