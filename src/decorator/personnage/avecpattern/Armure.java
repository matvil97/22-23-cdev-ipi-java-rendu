package decorator.personnage.avecpattern;

public class Armure extends PersonnageDecorator {

    private int protection;

    public Armure(Personnage personnage, int protection) {
        super(personnage);
        this.protection = protection;
    }

    @Override
    public void encaisserDegat(int degat, TypeDegat typeDegat) {
        if (typeDegat == TypeDegat.PHYSIQUE) {
            int degatTraverssant = Math.max(0, degat - protection);
            this.personnage.encaisserDegat(degatTraverssant, typeDegat);
        } else {
            this.personnage.encaisserDegat(degat, typeDegat);
        }
    }
}
