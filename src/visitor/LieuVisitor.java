package visitor;

public interface LieuVisitor {
    void visitMairie(Mairie mairie);

    void visitRestaurant(Restaurant restaurant);

    void visitBanque(Banque banque);

}
