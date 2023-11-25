import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // testing method of reversing a number
        Scanner in = new Scanner(System.in);
        System.out.println("enter number you want to reverse it ");
        int number = in.nextInt();
        System.out.println(reverseNumber(number));
        // testing method of returning number
        System.out.println("enter number ");
        int random = in.nextInt();
        System.out.println(RandomNumber(random));

        // testing method of generating random number between two numbers
        System.out.println("enter min number");
        int min = in.nextInt();
        System.out.println("enter Max number");
        int max = in.nextInt();
        System.out.println(RandomNumber(min, max));
        // testing method of generating upper case from A to Z
        System.out.println(upperCaseRandomChar('Z'));
        // testing method of generating lower case char from a to z
        System.out.println(lowerCaseRandomChar('a'));
        // testing the geniric method
        Integer[] IntArray = {1, 2, 3, 4, 5};
        PrintingArray(IntArray);
        // testing the geniric method
        Character[] CharArray = {'a', 'b', 'c'};
        PrintingArray(CharArray);
        // testing the geniric method
        String[] StringArray = {"sama", "eltohamy", "ahmed"};
        PrintingArray(StringArray);
    }


    //method of reversing number
    public static int reverseNumber(int number) {

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    // method of returning random number
    public static int RandomNumber(int num) {
        return (int) (Math.random() * (num + 1));
    }

    // method of generating  random number between two numbers
    public static int RandomNumber(int min, int max) {
        return (int) (min + (max - min + 1) * Math.random());
    }

    // method of generating capital num from A to Z
    public static char upperCaseRandomChar(char capitalRandom) {
        return (char) ('A' + Math.random() * (capitalRandom - 'A' + 1));
    }
    // method of generating lowercase num from a to z
    public static char lowerCaseRandomChar(char lowerCaseRandom) {
        return (char) ('a' + Math.random() * (lowerCaseRandom - 'a' + 1));
    }

    // method of printing an array of any type
    public static <T> void PrintingArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

