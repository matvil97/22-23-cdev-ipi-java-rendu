package singleton;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class RepertoireUtilisateurs {

    private static RepertoireUtilisateurs uniqueInstance = new RepertoireUtilisateurs();

    public static RepertoireUtilisateurs getInstance() {
        return uniqueInstance;
    }

    private List<String> utilisateurs = new ArrayList<>();

    private RepertoireUtilisateurs() {

    }

    public void ajouterUtilisateur(String paul) {
    }

    public void getUtilsateurs() {
    }
}
