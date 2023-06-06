package iterator.tuple;

public class PairIterator implements Iterator {
    private final Pair pair;
    private int cursor = 0;

    public PairIterator(Pair pair) {
        this.pair = pair;
    }

    @Override
    public boolean hasNext() {
        return cursor < 2;
    }

    @Override
    public String next() {
        String e;
        if (cursor == 0)
            e = pair.getA();
        else if (cursor == 1)
            e = pair.getB();
        else
            throw new IllegalStateException("cursor = " + cursor);
        cursor++;
        return e;
    }
}
