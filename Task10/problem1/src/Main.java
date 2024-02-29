import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Occurrences of characters in the string:");
        getCharacterOccurrences(inputString);


    }
    public static void getCharacterOccurrences(String str) {
        Map<Character, Integer> hash = new HashMap<>();
        for (char ch : str.toCharArray()) {
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


}
