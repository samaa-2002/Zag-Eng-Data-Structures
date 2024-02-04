import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] children = new String[n];
        for (int i = 0; i < n; i++) {
            children[i] = in.next();
        }
        int toses = in.nextInt();
        System.out.println("The winner is: "+ hotPotato(children,toses));
    }
    public static String hotPotato(String[] children, int tosses) {
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < children.length; i++) {
            queue.add(children[i]);
        }
        while (queue.size() > 1) {
            for (int i = 0; i < tosses-1; i++) {
                queue.add(queue.remove());
            }
            queue.remove();

        }
        return queue.remove();
    }
}
