
public class Main {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(90);
        list.printElements();
        System.out.println(list.max());
        System.out.println(list.min());
        list.removeFirst();
        list.removeLast();
        list.printElements();
        list.size();
        list.contains(10);
        list.indexOf(20);



    }
}