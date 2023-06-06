package visitor;

public interface Lieu {

    String getHoraires();

    void accept(LieuVisitor visitor);
}
