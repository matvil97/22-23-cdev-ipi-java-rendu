package poo.shape;

public class Cercle implements Shape {

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerSurface() {
        return Math.PI + Math.pow(this.rayon, 2);
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * this.rayon;
    }

    public double getRayon() {
        return rayon;
    }
}
