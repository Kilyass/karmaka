package Karmaka.Carte.Blue;

import Karmaka.Carte.Carte;

public class RevesBrises extends Carte {
    private static final String nom = "Rêves Brisés";
    private static final String couleur = "blue";
    private static final String description = "Placez la première carte de la Vie Future " +
            "d'un rival sur la vôtre.";
    private final int pt;

    public RevesBrises() {
        super(2, nom, couleur, description);
        this.pt = 2;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }

}
