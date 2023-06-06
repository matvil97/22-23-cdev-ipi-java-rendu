package factorymethod.stockage.avec.fichier;

import factorymethod.stockage.avec.ZoneStockageFactory;

public class StockageParFichierFactory implements ZoneStockageFactory {
    private final String repertoire;
    private int compteur = 0;

    public StockageParFichierFactory(String repertoire) {
        this.repertoire = repertoire;
    }

    @Override
    public Fichier creerZoneStockage() {
        int i = compteur++;
        String nomFichier = "fichier_" + i + ".txt";
        return new Fichier(this.repertoire + "/" + nomFichier);
    }
}
