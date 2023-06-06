package singleton;

public class Main {

    public static void main(String[] args) {
        RepertoireUtilisateurs singleton1 = RepertoireUtilisateurs.getInstance();
        singleton1.ajouterUtilisateur("Paul");
        singleton1.getUtilsateurs();
    }
}
