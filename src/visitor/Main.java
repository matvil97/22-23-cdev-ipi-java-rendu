package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Lieu> lieux = new ArrayList<>();
        //à remplir.

        // Sans PATTERN
        for (Lieu lieu : lieux) {
            System.out.println(lieu.getHoraires());

            if (lieu instanceof Restaurant) {
                Restaurant restaurant = (Restaurant) lieu;
                System.out.println(restaurant.getPrixMoyen());
            } else if (lieu instanceof Mairie) {

            } else if (lieu instanceof Banque) {
                Banque banque = (Banque) lieu;
                System.out.println(banque.getEnseigne());
            }
        }


        //Avec Pattern
        LieuVisitor visitor = new TouristeVisitor();
        for (Lieu lieu : lieux) {
            lieu.accept(visitor);
        }
    }
}
