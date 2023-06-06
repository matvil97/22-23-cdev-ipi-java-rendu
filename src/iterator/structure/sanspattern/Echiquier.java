package iterator.structure.sanspattern;

public class Echiquier implements Iterable {
    private Personnage[][] plateau = new Personnage[8][8];
    Personnage getContenu(int x, int y) {
        return plateau[x][y];
    }
    @Override
    public Iterator getIterator() {
        return new EchiquierIterator(this);
    }
}
