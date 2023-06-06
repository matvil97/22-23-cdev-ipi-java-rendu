package factorymethod.stockage.avec;

import factorymethod.stockage.avec.fichier.StockageParFichierFactory;

public class Main {

    public static void main(String[] args) {
        ZoneStockageFactory zoneStockageFactory = new StockageParFichierFactory("c:/temp/fichier.txt");
        run(zoneStockageFactory);
    }

    private static void run(ZoneStockageFactory zoneStockageFactory) {
        ZoneStockage stockagePreference = zoneStockageFactory.creerZoneStockage();
        stockagePreference.save("data");

        ZoneStockage stockageTravailEnCours = zoneStockageFactory.creerZoneStockage();
        stockageTravailEnCours.save("WORK IN PROGESS.");
    }
}
