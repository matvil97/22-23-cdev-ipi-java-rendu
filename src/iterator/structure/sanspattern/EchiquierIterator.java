package iterator.structure.sanspattern;

public class EchiquierIterator implements Iterator {
    private final Echiquier echiquier;

    private int currentX, currentY;
    public EchiquierIterator(Echiquier echiquier) {
        this.echiquier = echiquier;
    }
    @Override
    public boolean hasNext() {
        return (currentX < 8) && (currentY < 8);
    }
    @Override
    public Personnage next() {
        Personnage p = echiquier.getContenu(currentX, currentY);
        currentX++;
        if (currentX == 8) {
            currentX = 0;
            currentY++;
        }
        return p;
    }
}
