package Karmaka.Carte.Red;

import Karmaka.Carte.Carte;

public class Fournaise extends Carte {
    private static final String nom = "Fournaise";
    private static final String couleur = "Red";
    private static final String description = "Défaussez les 2 premières cartes " +
            "de la Vie Future d'un rival.";

    private final int pt;

    public Fournaise() {
        super(2, nom, couleur, description);
        this.pt = 2;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
