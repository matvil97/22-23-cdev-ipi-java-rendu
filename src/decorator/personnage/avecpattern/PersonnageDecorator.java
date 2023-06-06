package decorator.personnage.avecpattern;

public abstract class PersonnageDecorator implements Personnage {

    protected final Personnage personnage;

    public PersonnageDecorator(Personnage personnage) {
        this.personnage = personnage;
    }

    @Override
    public void encaisserDegat(int degat, TypeDegat typeDegat) {
        personnage.encaisserDegat(degat, typeDegat);
    }

    @Override
    public int getPointDeVie() {
        return personnage.getPointDeVie();
    }
}
