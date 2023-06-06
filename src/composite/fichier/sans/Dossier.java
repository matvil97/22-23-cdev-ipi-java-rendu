package composite.fichier.sans;

import java.util.ArrayList;
import java.util.List;

// alexandre.petrillo@gmail.com

public class Dossier {
    private List<Fichier> fichiers = new ArrayList<>();
    private List<Dossier> sousDossiers = new ArrayList<>();

    public void add(Fichier fichier) {
        fichiers.add(fichier);
    }

    public int calculerTaille() {
        int taille = 0;
        for (Fichier fichier : fichiers) {
            taille += fichier.getTaille();
        }
        for (Dossier sousDossier : sousDossiers) {
            taille += sousDossier.calculerTaille();
        }
        return taille;
    }

    public void addSousDossier(Dossier sousDossier) {
        sousDossiers.add(sousDossier);
    }
}
