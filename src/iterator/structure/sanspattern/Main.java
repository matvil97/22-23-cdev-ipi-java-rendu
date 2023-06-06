package iterator.structure.sanspattern;

public class Main {

    Echiquier echiquier = new Echiquier();

    public void verifierPersonnagesEnVie() {

        Iterator iterator = echiquier.getIterator();
        while (iterator.hasNext()) {
            Personnage personnage = iterator.next();
            int pointDeVie = personnage.getPointDeVie();
            if (pointDeVie <= 0) {
                // ...
            }
        }

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                Personnage personnage = echiquier.getContenu(x, y);
                if (personnage != null) {
                    int pointDeVie = personnage.getPointDeVie();
                    if (pointDeVie <= 0) {
                        // ...
                    }
                }
            }
        }
    }

}
