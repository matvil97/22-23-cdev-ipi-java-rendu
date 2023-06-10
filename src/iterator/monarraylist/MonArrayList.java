package iterator.monarraylist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MonArrayList implements Iterable<String> {
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
        int i = 0;
        for (String s : array) {
            array2[i++] = s;
        }
    }

    public int size() {
        return index;
    }

    @Override
    public Iterator<String> iterator() {
        return new MonArrayListIterator();
    }

    private class MonArrayListIterator implements Iterator<String> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < index;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String element = array[currentIndex];
            currentIndex++;
            return element;
        }
    }
}
