package iterator.monarraylist;

public class MonArrayList {

    private String[] array = new String[10];
    private int index = 0;

    public String get(int index) {
        return array[index];
    }

    public void add(String elem) {
        if (index >= array.length) {
            doubleTaille();
        }
        array[index] = elem;
        index++;
    }

    private void doubleTaille() {
        String[] array2 = new String[array.length * 2];
        copie(array, array2);
        array = array2;
    }

    private void copie(String[] array, String[] array2) {
        // TODO
    }
}
