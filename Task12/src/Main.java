public class Main {
    public static void main(String[] args) {

        Tree tree1= new Tree();
        tree1.insert(45);
        tree1.insert(15);
        tree1.insert(10);
        tree1.insert(10);
        tree1.insert(20);
        tree1.insert(79);
        tree1.insert(55);
        tree1.insert(50);
        tree1.insert(90);
        Tree tree2= new Tree();
        tree2.insert(45);
        tree2.insert(15);
        tree2.insert(10);
        tree2.insert(10);
        tree2.insert(20);
        tree2.insert(79);
        tree2.insert(55);
        tree2.insert(50);
        tree2.insert(90);


        System.out.println(tree1.equals(tree2));
        System.out.println(tree1.kthElementFromRoot(2));
        tree1.levelOrder();
    }

}
