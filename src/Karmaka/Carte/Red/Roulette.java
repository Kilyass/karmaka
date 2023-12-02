package Karmaka.Carte.Red;

import Karmaka.Carte.Carte;

public class Roulette extends Carte {
    private static final String nom = "Roulette";
    private static final String couleur = "Red";
    private static final String description = "Défaussez jusqu’à 2 cartes de votre " +
            "Main.\n" +
            "Vous pouvez ensuite puiser à la " +
            "Source autant de carte(s) + 1.";

    private final int pt;

    public Roulette() {
        super(2, nom, couleur, description);
        this.pt = 2;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
