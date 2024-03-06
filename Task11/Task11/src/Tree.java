public class Tree {
        private class Node {
        private int value;
        private Node rightChild;
        private Node leftChild;

        public Node(int value) {
            this.value = value;
        }
    }

     private Node root;

    public void insert(int value) {
        Node node = new Node(value);
        if (root == null)
            root = node;
        else {
            Node parent=getParent(value);
            if (value>= parent.value)
                parent.rightChild=node;
            else
                parent.leftChild=node;
        }
    }

    public Node getParent(int value) {
        Node current = root;
        Node parent = root;
        while (current != null) {
            parent = current;
            if (value >= parent.value)
                current = current.rightChild;
            else
                current = current.leftChild;
        }
        return parent;
    }
    public boolean find(int value){
        Node current =root;
        while (current!=null){
            if (value== current.value)
                return true;
            else if (value>current.value)
                current=current.rightChild;
            else
                current=current.leftChild;
        }
        return false;
    }
    public int max(){
        int max=root.value;
        Node current=root;
        while (current!=null){
            max= current.value;
            current=current.rightChild;
        }
        return max;
    }
    public int min(){
        int min=root.value;
        Node current=root;
        while (current!=null){
            min= current.value;
            current=current.leftChild;
        }
        return min;
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node root){
        if(root==null)
            return;
        else{
            System.out.println(root.value);
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node root){
        if(root==null)
            return;
        else{
            inOrder(root.leftChild);
            System.out.println(root.value);
            inOrder(root.rightChild);
        }
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node root){
        if(root==null)
            return;
        else{
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.println(root.value);
        }
    }
    public void descendingOrder(){
        descendingOrder(root);
    }
    private void descendingOrder (Node root){
        if(root==null)
            return;
        else{
           descendingOrder(root.rightChild);
            System.out.println(root.value);
            descendingOrder(root.leftChild);
        }
    }

}
