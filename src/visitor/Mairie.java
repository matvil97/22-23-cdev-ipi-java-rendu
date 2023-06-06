package visitor;

public class Mairie implements Lieu  {
    @Override
    public String getHoraires() {
        return null;
    }

    @Override
    public void accept(LieuVisitor visitor) {
        visitor.visitMairie(this);
    }
}
