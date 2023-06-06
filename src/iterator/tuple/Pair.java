package iterator.tuple;

public class Pair implements Tuple {
    private final String a;
    private final String b;

    public Pair(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    @Override
    public Iterator getIterator() {
        return new  PairIterator(this);
    }
}

