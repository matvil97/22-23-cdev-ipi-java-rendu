package poo.shape;


import java.util.List;


public class Main {
    private double coeff;

    public void estimerQuanitePeiture(List<Shape> shapes) {
        double quantite = 0;
        for (Shape shape : shapes) {
            double surface = shape.calculerSurface();
            quantite = quantite +
                    (surface * coeff);
        }
    }


    public void estimerQuanitePeiture(
            List<Cercle> cercles,
            List<Rectangle> rectangles) {
        double quantite = 0;
        for (Cercle cercle : cercles) {
            double surface = cercle.calculerSurface();
            quantite = quantite +
                    (surface * coeff);
        }
        for (Rectangle rectangle : rectangles) {
            double surface = rectangle.calculerSurface();
            quantite = quantite +
                    (surface * coeff);
        }
    }
}
