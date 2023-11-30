public class Main {
    public static void main(String[] args) {
        dynamicArray array = new dynamicArray(2);
        array.insert(3);
        array.insert(4);
        array.insert(8);
        array.insert(15);
        array.insert(49);
        array.printArray();
        array.removeAt(4);
        array.printArray();
        System.out.println(array.indexOf(3));
        System.out.println(array.at(2));
        array.removeItem(3);
        System.out.println(array.min());
        System.out.println(array.max());
    }
}