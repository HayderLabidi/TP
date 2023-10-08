public class Livre {
    String titre,id;
    float prix;
    String auteur;
    static int count;
    public Livre(String titre, String id, String auteur, float prix) {
        this.id=id;
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
        count++;

    }
    public void affiche() {
        System.out.println("id: " + this.id + " titre: " + this.titre + " auteur: "+ this.auteur + " prix: "+ this.prix);
    }
}
