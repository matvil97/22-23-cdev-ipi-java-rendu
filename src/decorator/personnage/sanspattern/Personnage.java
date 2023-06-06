package decorator.personnage.sanspattern;

public class Personnage {
    private int pointDeVie;

    private Armure armure = null;
    private CapeSorcier capeSorcier = null;

    public Personnage(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public void encaisserDegat(int degat, TypeDegat typeDegat) {
        if (typeDegat == TypeDegat.PHYSIQUE) {
            if (armure != null) {
                int degatTraverssant = Math.max(0, degat - armure.getProtection());
                pointDeVie = pointDeVie - degatTraverssant;
            } else {
                pointDeVie = pointDeVie - degat;
            }
        } else if (typeDegat == TypeDegat.MAGIQUE) {
            if (capeSorcier != null) {
                double coeffTraversant = 1 - capeSorcier.getCoeffDAbsorption();
                double degatTraverssant = degat * coeffTraversant;
                pointDeVie = pointDeVie - (int) Math.floor(degatTraverssant);
            } else {
                pointDeVie = pointDeVie - degat;
            }
        }
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setArmure(Armure armure) {
        this.armure = armure;
    }

    public void setCapeSorcier(CapeSorcier capeSorcier) {
        this.capeSorcier = capeSorcier;
    }
}
