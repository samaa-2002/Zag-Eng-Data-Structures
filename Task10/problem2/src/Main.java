import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        char firstNonRepeated = findFirstNonRepeatedCharacter(inputString);

        if (firstNonRepeated != '\0') {
            System.out.println("First non-repeated character: " + firstNonRepeated);
        } else {
            System.out.println("No non-repeated character found.");
        }

    }

    public static char findFirstNonRepeatedCharacter(String str) {

        Map<Character, Integer> charCounts = new HashMap<>();


        for (char ch : str.toCharArray()) {
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }


        for (char ch : str.toCharArray()) {
            if (charCounts.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }


}
