package Karmaka.Carte.Mosaique;
import Karmaka.Main;
import Karmaka.Carte.Carte;

public class Incarnation extends Carte {
    private static final String nom = "Incarnation";
    private static final String couleur = "Mosaique";
    private static final String description = "Choisissez une de vos Oeuvres.\n" +
            "Copiez son pouvoir.";

    private final int pt;

    public Incarnation() {
        super(1, nom, couleur, description);
        this.pt = 1;
    }
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte " + this.nom + "et de niveau" + this.pt);
         /*
               joueur2.getHand();
              joueur2.oueuvre.poll(carte);
              this.incarnation  = carte ;
                       */
    }
}
