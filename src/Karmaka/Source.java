package Karmaka;
import Karmaka.Carte.*;
import Karmaka.Carte.Blue.*;
import Karmaka.Carte.Green.*;
import Karmaka.Carte.Red.*;
import Karmaka.Carte.Mosaique.*;
import java.util.*;
public class Source {
    private static Source source;
        private List<Carte> cartes;

        public Source() {
            this.cartes = new ArrayList<>();
            // Ajoutez vos cartes à la source ici
            cartes.add(new Transmigration());
            cartes.add(new Transmigration());
            cartes.add(new Transmigration());
            cartes.add(new CoupOeil());
            cartes.add(new CoupOeil());
            cartes.add(new CoupOeil());
            cartes.add(new Destinee());
            cartes.add(new Destinee());
            cartes.add(new Destinee());
            cartes.add(new RevesBrises());
            cartes.add(new RevesBrises());
            cartes.add(new RevesBrises());
            cartes.add(new Deni());
            cartes.add(new Deni());
            cartes.add(new Deni());
            cartes.add(new Duperie());
            cartes.add(new Duperie());
            cartes.add(new Vol());
            cartes.add(new Vol());
            cartes.add(new Lendemain());
            cartes.add(new Lendemain());
            cartes.add(new Lendemain());
            cartes.add(new Recyclage());
            cartes.add(new Recyclage());
            cartes.add(new Recyclage());
            cartes.add(new Sauvetage());
            cartes.add(new Sauvetage());
            cartes.add(new Sauvetage());
            cartes.add(new Longevite());
            cartes.add(new Longevite());
            cartes.add(new Longevite());
            cartes.add(new Semis());
            cartes.add(new Semis());
            cartes.add(new Semis());
            cartes.add(new Voyage());
            cartes.add(new Voyage());
            cartes.add(new Jubile());
            cartes.add(new Jubile());
            cartes.add(new Panique());
            cartes.add(new Panique());
            cartes.add(new Panique());
            cartes.add(new DernierSouffle());
            cartes.add(new DernierSouffle());
            cartes.add(new DernierSouffle());
            cartes.add(new Crise());
            cartes.add(new Crise());
            cartes.add(new Crise());
            cartes.add(new Roulette());
            cartes.add(new Roulette());
            cartes.add(new Roulette());
            cartes.add(new Fournaise());
            cartes.add(new Fournaise());
            cartes.add(new Fournaise());
            cartes.add(new Vengeance());
            cartes.add(new Vengeance());
            cartes.add(new Bassesse());
            cartes.add(new Bassesse());
            cartes.add(new Incarnation());
            cartes.add(new Incarnation());
            cartes.add(new Incarnation());
            cartes.add(new Incarnation());
            cartes.add(new Incarnation());
            cartes.add(new Mimetisme());
            cartes.add(new Mimetisme());
            // Mélangez les cartes
            Collections.shuffle(cartes);
        }
    public static Source getInstance() {
        if (source==null) {
            source = new Source();
        }
        return source;
    }

}
