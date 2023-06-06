package visitor;

public class Banque implements Lieu {
    public String getEnseigne() {
        return "";
    }

    @Override
    public String getHoraires() {
        return null;
    }

    @Override
    public void accept(LieuVisitor visitor) {
        visitor.visitBanque(this);
    }
}
