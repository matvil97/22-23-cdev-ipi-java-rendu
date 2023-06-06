package iterator.linkedlist;

public class MaLinkedList {

    private Element premier = new Element(null, null);
    private Element dernier = premier;

    public String get(int index) {
        int currentIndex = 0;
        Element currentElement = premier;
        while (currentIndex <= index) {
            currentElement = currentElement.suivant;
            currentIndex++;
        }
        return currentElement.valeur;
    }

    public void add(String valeur) {
        Element nouveau = new Element(valeur, null);
        dernier.suivant = nouveau;
        dernier = nouveau;
    }

    public int size() {
        int currentIndex = 0;
        Element currentElement = premier;
        while (currentElement.suivant != null) {
            currentElement = currentElement.suivant;
            currentIndex++;
        }
        return currentIndex;
    }
}

class Element {
    String valeur;
    Element suivant;

    public Element(String valeur, Element suivant) {
        this.valeur = valeur;
        this.suivant = suivant;
    }
}