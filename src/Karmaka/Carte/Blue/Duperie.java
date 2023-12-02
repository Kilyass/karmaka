package Karmaka.Carte.Blue;

import Karmaka.Carte.Carte;

public class Duperie extends Carte {
    private static final String nom = "Duperie";
    private static final String couleur = "blue";
    private static final String description = "Regardez 3 cartes de la Main d’un " +
            "rival ; ajoutez-en une à votre Main.";
    private final int pt;

    public Duperie() {
        super(3, nom, couleur, description);
        this.pt = 3;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
