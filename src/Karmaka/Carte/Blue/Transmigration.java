package Karmaka.Carte.Blue;

import Karmaka.Carte.Carte;

public class Transmigration extends Carte {
    // Hardcoded values for nom, couleur, and description
    private static final String nom = "Transmigration";
    private static final String couleur = "blue";
    private static final String description = "Placez dans votre Main n’importe quelle carte de votre Vie Future.";
    private final int pt;

    public Transmigration() {
        super(1, nom, couleur, description);
        this.pt = 1;
    }

    @Override
    public void activerCapacite() {
        System.out.println("Joue pouvoir carte "+this.nom+ "et de niveau" +this.pt);
        //joueur.main.poll();
        //return this.mains.setCart();
         /* Carte existingCarte = VieFuture.getCarte();

        // Check if existingCarte is not null before using it
        if (existingCarte != null) {
            joueur.VieFuture.poll(existingCarte);
            joueur.Main.add(existingCarte);
        } */
    }

}
