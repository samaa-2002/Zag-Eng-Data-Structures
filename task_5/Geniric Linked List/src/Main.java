public class Main {
    public static void main(String[] args) {
        geniricLinkedList<Double> list = new geniricLinkedList<>();
        list.addFirst(10.5);
        list.addFirst(20.9);
        list.addLast(90.8);
        list.printElements();
        list.removeFirst();
        list.removeLast();
        list.printElements();
        list.reverse();
        list.printElements();


    }
}