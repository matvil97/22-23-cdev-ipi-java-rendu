package iterator.linkedlist;


public class Main {
    public static void main(String[] args) {
        MaLinkedList maLinkedList = new MaLinkedList();

        System.out.println("Size au début " + maLinkedList.size());

        maLinkedList.add("0");
        maLinkedList.add("1");
        maLinkedList.add("2");
        maLinkedList.add("3");
        maLinkedList.add("4");
        maLinkedList.add("5");
        maLinkedList.add("6");
        maLinkedList.add("7");
        maLinkedList.add("8");
        maLinkedList.add("9");
        maLinkedList.add("10");

        System.out.println("Element à l'index 9 : " + maLinkedList.get(9));
        System.out.println("Element à l'index 10 : " + maLinkedList.get(10));
        System.out.println("Size à la fin " + maLinkedList.size());
    }
}
