package observator.magasin;

public class Main {
    public static void main(String[] args) {
        Magasin magasin = new Magasin();

        Client client = new Client();
        magasin.subscribe(client);
        magasin.subscribe(client);

        magasin.acheter();
        magasin.acheter();

        magasin.receptionnerProduits(10);
    }
}
