package Karmaka.Carte;

public abstract class Carte {
      private  int point;
      private  String nom;
      private   String  couleur;
      private  String  description;
      // Constructor
      public Carte(int pt,String nom ,String couleur,String  description) {
         this.point = pt ;
         this.nom = nom;
         this.couleur = couleur;
         this.description = description;
      }
        public int getPoint() {
            return point;
        }

        public String getNom() {
            return nom;
        }

        public String getCouleur() {
            return couleur;
        }
      public void getInfoCarte(){
          System.out.println("Nom : " + getNom());
          System.out.println("Point : " + getPoint());
          System.out.println("Couleur : " + getCouleur());
      }
    public abstract void activerCapacite();
}

