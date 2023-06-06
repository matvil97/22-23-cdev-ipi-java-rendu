package observator.magasin_fournisseur;

import java.util.ArrayList;
import java.util.List;

public class Magasin implements Observable, Observator {
    private List<Observator> observators = new ArrayList<>();

    private int stock = 2;

    public void acheter() {
        if (stock == 0) {
            throw new IllegalStateException("Stock vide !");
        }
        System.out.println("Achat !");
        stock--;
    }

    public void receptionnerProduits(int nbProduits) {
        if (stock == 0) {
            for (Observator observator : observators) {
                observator.alert("Il y a du stock!");
            }
        }
        stock = stock + nbProduits;
    }

    @Override
    public void subscribe(Observator observator) {
        observators.add(observator);
    }

    @Override
    public void unsubscribe(Observator observator) {
        observators.remove(observator);
    }

    @Override
    public void alert(String message) {
        System.out.println("Mon fournisseur a à nouveau du stock.");
    }
}
