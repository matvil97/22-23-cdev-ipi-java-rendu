package visitor;

public class TouristeVisitor extends EmptyLieuVisitor {

    @Override
    public void visitRestaurant(Restaurant restaurant) {
        System.out.println("Restaurant " + restaurant.getPrixMoyen() + " ouvert à " + restaurant.getHoraires());
    }

}
