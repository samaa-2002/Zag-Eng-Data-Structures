import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] frequencyArray = new int[M];
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
            frequencyArray[A[i] - 1]++;
        }
        for (int i = 0; i < frequencyArray.length; i++) {
            System.out.println(frequencyArray[i]);
        }
    }
}
