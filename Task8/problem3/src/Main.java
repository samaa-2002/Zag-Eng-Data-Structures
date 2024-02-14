import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int[] frequencyArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequencyArray[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] != 0) {
                for (int j = 0; j < frequencyArray[i]; j++)
                    System.out.print((char) (i + 'a'));
            }
        }
    }
}