public class Main {
    public static void main(String[] args) {

       Tree tree= new Tree();
       tree.insert(45);
        tree.insert(15);
        tree.insert(10);
        tree.insert(10);
        tree.insert(20);
        tree.insert(79);
        tree.insert(55);
        tree.insert(50);
        tree.insert(90);

       tree.postOrder();
    }

}
