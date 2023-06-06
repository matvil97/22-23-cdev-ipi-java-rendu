package decorator.personnage.avecpattern;

public class PersonnageDecorator implements Personnage {

    protected final Personnage personnage;

    public PersonnageDecorator(Personnage personnage) {
        this.personnage = personnage;
    }

    @Override
    public void encaisserDegat(int degat, TypeDegat typeDegat) {

    }

    @Override
    public int getPointDeVie() {
        return 0;
    }
}
