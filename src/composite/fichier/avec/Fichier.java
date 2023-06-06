package composite.fichier.avec;

public class Fichier implements File {
    private String nom;
    private int taille;

    public Fichier(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public int getTaille() {
        return taille;
    }
}
