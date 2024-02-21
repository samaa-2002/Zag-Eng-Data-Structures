import java.util.Scanner;
// thre is a problem with space because of hash function 

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        String userInput = in.nextLine();
        int[] freq = new int[26];
        for (int i = 0; i < userInput.length(); i++) {
            freq[hash(userInput.charAt(i))]++;
        }
        for (int i = 0; i < userInput.length(); i++) {
            int index=hash(userInput.charAt(i));
            if (freq[index] ==1) {
                System.out.println(userInput.charAt(i));
                break;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {

                System.out.println((char) (i + 'a') + " : " + freq[i]);
            }
        }
    }

public static int hash(char c){
        return c-'a';
}
}
