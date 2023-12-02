package Karmaka.Carte.Red;

import Karmaka.Carte.Carte;

public class DernierSouffle extends Carte {
    private static final String nom = "Dernier Souffle";
    private static final String couleur = "Red";
    private static final String description = "Le joueur de votre choix " +
            "défausse une carte de sa Main.";

    private final int pt;

    public DernierSouffle () {
        super(1, nom, couleur, description);
        this.pt = 1;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
