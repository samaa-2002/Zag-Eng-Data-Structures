import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int mostRepeated = findMostRepeatedElement(arr);
        System.out.println("Most repeated element: " + mostRepeated);


    }
    public static int findMostRepeatedElement(int[] arr) {
        // Create a HashMap to store element counts
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each element in the array
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the element with the maximum count
        int maxCount = Integer.MIN_VALUE;
        int mostRepeatedElement = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostRepeatedElement = entry.getKey();
            }
        }

        return mostRepeatedElement;
    }


}
