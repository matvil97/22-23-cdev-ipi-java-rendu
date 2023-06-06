package composite.militaire.avec;

public class Soldat implements UniteMilitaire {

    private String prenom;

    public Soldat(String prenom) {
        this.prenom = prenom;
    }

    public void avancer() {
        // TODO...
    }

    public String getPrenom() {
        return prenom;
    }
}
