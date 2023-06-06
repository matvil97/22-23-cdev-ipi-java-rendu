package composite.fichier.avec;

import java.util.ArrayList;
import java.util.List;

// alexandre.petrillo@gmail.com

public class Dossier implements File {
    private String nom;
    private List<File> files = new ArrayList<>();

    public Dossier(String nom) {
        this.nom = nom;
    }

    public void add(File file) {
        files.add(file);
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public int getTaille() {
        int taille = 0;
        for (File file : files) {
            taille += file.getTaille();
        }
        return taille;
    }
}
