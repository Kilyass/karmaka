package Karmaka.Carte.Red;

import Karmaka.Carte.Carte;

public class Crise extends Carte {
    private static final String nom = "Crise";
    private static final String couleur = "Red";
    private static final String description = "Le joueur de votre choix " +
            "défausse une carte de sa Main.";

    private final int pt;

    public Crise() {
        super(2, nom, couleur, description);
        this.pt = 2;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
