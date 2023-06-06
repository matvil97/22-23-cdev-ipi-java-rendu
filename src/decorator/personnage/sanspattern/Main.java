package decorator.personnage.sanspattern;

public class Main {

    public static void main(String[] args) {
        Personnage personnage = new Personnage(100);

        personnage.encaisserDegat(20, TypeDegat.PHYSIQUE);
        System.out.println(personnage.getPointDeVie());

        personnage.setArmure(new Armure(10));
        personnage.encaisserDegat(20, TypeDegat.PHYSIQUE);
        System.out.println(personnage.getPointDeVie());


        personnage.encaisserDegat(20, TypeDegat.MAGIQUE);
        System.out.println(personnage.getPointDeVie());

        personnage.setCapeSorcier(new CapeSorcier(0.1));
        personnage.encaisserDegat(20, TypeDegat.MAGIQUE);
        System.out.println(personnage.getPointDeVie());

    }

}
