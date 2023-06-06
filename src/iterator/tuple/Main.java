package iterator.tuple;

public class Main {
    public static void main(String[] args) {
        Pair pair = new Pair("abc", "xyz");
        Triplet triplet = new Triplet("123", "x", "z");


        System.out.println(pair.getA());
        System.out.println(pair.getB());

        System.out.println(triplet.getA());
        System.out.println(triplet.getB());
        System.out.println(triplet.getC());


        Tuple tuple = null;//TODO
        Iterator iterator = tuple.getIterator();
        while(iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    }
}
