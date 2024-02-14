import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        int[] frequencyArray = new int[26];
        for (int i = 0; i < input.length(); i++) {
            frequencyArray[input.charAt(i) - 'a']++;
        }
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] != 0) {

                System.out.println((char) (i + 'a') + " : " + frequencyArray[i]);
            }
        }

    }
}