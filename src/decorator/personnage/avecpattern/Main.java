package decorator.personnage.avecpattern;

public class Main {

    public static void main(String[] args) {
        Personnage personnage = new PersonneNue(100);

        personnage.encaisserDegat(20, TypeDegat.PHYSIQUE);
        System.out.println(personnage.getPointDeVie());

        personnage = new PersonneEnArmure(personnage,10);
        personnage.encaisserDegat(20, TypeDegat.PHYSIQUE);
        System.out.println(personnage.getPointDeVie());


        personnage.encaisserDegat(20, TypeDegat.MAGIQUE);
        System.out.println(personnage.getPointDeVie());

        personnage = new PersonneEnCapeSorcier(personnage,0.1);

        personnage.encaisserDegat(20, TypeDegat.MAGIQUE);
        System.out.println(personnage.getPointDeVie());

    }

}
