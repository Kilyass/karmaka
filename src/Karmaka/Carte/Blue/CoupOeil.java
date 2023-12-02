package Karmaka.Carte.Blue;

import Karmaka.Carte.Carte;

public class CoupOeil extends Carte {
    private static final String nom = "CoupOeil";
    private static final String couleur = "blue";
    private static final String description = "Regardez la Main d’un rival.\n" +
            "Vous pouvez ensuite jouer une autre carte.";

    private final int pt;

    public CoupOeil() {
        super(1, nom, couleur, description);
        this.pt = 1;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de point" + this.pt);
        //to do
    }
    /*
    public void activerCapacite(Joueur  joueur2) {
        System.out.println("Joue pouvoir carte " + this.nom + "et de point" + this.pt);
        Main rivalHand = joueur2.getHand();
        playAnotherCard();
    }
      public void playAnotherCard() {
        // Implement logic to play another card

    }
    public Main getHand() {     //Méthode sur la class Main
        return hand;
    }
     */
}
