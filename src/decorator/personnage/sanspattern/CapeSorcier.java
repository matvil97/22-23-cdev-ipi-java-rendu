package decorator.personnage.sanspattern;

public class CapeSorcier {
    private double coeffAbsorption;

    public CapeSorcier(double coeffAbsorption) {
        this.coeffAbsorption = coeffAbsorption;
    }


    public double getCoeffDAbsorption() {
        return coeffAbsorption;
    }
}
