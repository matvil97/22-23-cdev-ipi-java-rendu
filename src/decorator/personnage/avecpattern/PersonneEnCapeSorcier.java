package decorator.personnage.avecpattern;

public class PersonneEnCapeSorcier extends PersonnageDecorator {

    private double coeffDAbsorption;

    public PersonneEnCapeSorcier(Personnage personnage, double coeffDAbsorption) {
        super(personnage);
        this.coeffDAbsorption = coeffDAbsorption;
    }

    @Override
    public void encaisserDegat(int degat, TypeDegat typeDegat) {
        if (typeDegat == TypeDegat.MAGIQUE) {
            double coeffTraversant = 1 - coeffDAbsorption;
            int degatTraverssant = (int) Math.floor(degat * coeffTraversant);
            personnage.encaisserDegat(degatTraverssant, typeDegat);
        } else {
            personnage.encaisserDegat(degat, typeDegat);
        }
    }
}
