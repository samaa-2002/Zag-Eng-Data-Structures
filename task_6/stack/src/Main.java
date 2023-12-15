public class Main {
    public static void main(String[] args) {
        StackBasedOnArray stack1=new StackBasedOnArray();
        StackBasedOnLinkedList stack2=new StackBasedOnLinkedList();
        stack1.push(2);
        stack1.push(4);
        stack1.push(1);
        System.out.println(stack1.pop());
        System.out.println(stack1.peak());
        stack2.push(2);
        stack2.push(4);
        stack2.push(1);
       System.out.println(stack2.pop());
       System.out.println(stack2.peak());
        System.out.println(reverse("samaa"));
        System.out.println(Expression.isValid("(("));
        System.out.println(Expression.isValid("(<>)"));

    }
    public static String reverse(String s){
        StackBasedOnLinkedList<Character> stack=new StackBasedOnLinkedList<>();
        String reverse="";
        for (int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()){
            reverse+=stack.pop();
        }
        return reverse;
    }
}