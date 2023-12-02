package Karmaka.Carte.Blue;

import Karmaka.Carte.Carte;

public class Vol extends Carte {
    private static final String nom = "Vol";
    private static final String couleur = "blue";
    private static final String description = "Placez dans votre Main " +
            "l’Oeuvre Exposée d'un rival.";
    private final int pt;

    public Vol() {
        super(3, nom, couleur, description);
        this.pt = 3;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        /*
        joueur.Oeuvre.poll();
        joueur.Main.put(carte);
         */
    }
}
