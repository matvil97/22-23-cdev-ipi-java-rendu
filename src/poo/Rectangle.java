package poo;

public class Rectangle implements Shape {

    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerSurface() {
        return this.largeur * this.longueur;
    }

    @Override
    public double calculerPerimetre() {
        return (this.largeur + this.longueur) * 2;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }
}
