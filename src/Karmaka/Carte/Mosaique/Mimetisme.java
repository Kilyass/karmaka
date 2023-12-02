package Karmaka.Carte.Mosaique;

import Karmaka.Carte.Carte;

public class Mimetisme extends Carte {
    private static final String nom = "Mimétisme";
    private static final String couleur = "Mosaique";
    private static final String description = "Choisissez un Rival.\n" +
            "Copiez le pouvoir de son Oeuvre Exposée.";

    private final int pt;

    public Mimetisme() {
        super(1, nom, couleur, description);
        this.pt = 1;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + nom + "et de point" + pt);
        //to do
    }
}
