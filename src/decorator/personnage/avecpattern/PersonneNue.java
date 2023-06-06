package decorator.personnage.avecpattern;

public class PersonneNue implements Personnage {
    private int pointDeVie;
    public PersonneNue(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public void encaisserDegat(int degat, TypeDegat typeDegat) {
        pointDeVie = pointDeVie - degat;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

}
