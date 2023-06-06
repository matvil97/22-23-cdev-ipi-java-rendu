package visitor;

public class Restaurant implements Lieu  {
    @Override
    public String getHoraires() {
        return null;
    }

    public double getPrixMoyen() {
        return 0;
    }

    @Override
    public void accept(LieuVisitor visitor) {
        visitor.visitRestaurant(this);
    }
}
