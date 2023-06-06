package observator.magasin_fournisseur;

public interface Observable {

    void subscribe(Observator observator);

    void unsubscribe(Observator observator);
}
