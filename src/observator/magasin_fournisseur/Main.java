package observator.magasin_fournisseur;

public class Main {
    public static void main(String[] args) {
        Magasin grossiste = new Magasin();

        Client client = new Client();
        Magasin magasin = new Magasin();
        Reparateur reparateur = new Reparateur();

        grossiste.subscribe(client);
        grossiste.subscribe(magasin);
        grossiste.subscribe(reparateur);

        grossiste.acheter();
        grossiste.acheter();
        grossiste.receptionnerProduits(10);

    }
}
