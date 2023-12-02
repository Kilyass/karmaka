package Karmaka.Carte.Blue;

import Karmaka.Carte.Carte;

public class Destinee extends Carte {
    private static final String nom = "Destinée";
    private static final String couleur = "blue";
    private static final String description = "Regardez les 3 premières cartes de la Source.\n" +
            "Ajoutez-en jusqu’à 2 à votre Vie Future.\n" +
            "Replacez le reste dans l'ordre souhaité." ;

    private final int pt;

    public Destinee() {
        super(2, nom, couleur, description);
        this.pt = 2;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
        //to do
    }
}
