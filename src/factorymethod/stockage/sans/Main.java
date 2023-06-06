package factorymethod.stockage.sans;

import factorymethod.stockage.sans.fichier.Fichier;

public class Main {

    public static void main(String[] args) {
        boolean cloud = true;


        Fichier fichierPreferences  = new Fichier("c:/stockage/preferences.txt");
        Fichier fichierTravailEnCours  = new Fichier("c:/temp/travailEnCours.txt");


        FichierCloud cloudPref  = new FichierCloud("c:/stockage/preferences.txt");
        FichierCloud cloudTravailEncours  = new FichierCloud("c:/temp/travailEnCours.txt");

        //...

        if (cloud) {
            cloudPref.save("data");
            cloudTravailEncours.save("WORK IN PROGESS.");
        } else{
            fichierPreferences.save("data");
            fichierTravailEnCours.save("WORK IN PROGESS.");
        }
    }
}
