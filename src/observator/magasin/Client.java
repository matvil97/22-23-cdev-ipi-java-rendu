package observator.magasin;

public class Client implements Observator {
    @Override
    public void alert(String message) {
        System.out.println("Je viens de recevoir une notification du magasin " + message);
    }
}
