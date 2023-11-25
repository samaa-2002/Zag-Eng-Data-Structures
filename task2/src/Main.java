import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // testing method of reversing a number
        Scanner in = new Scanner(System.in);
        System.out.println("enter number you want to reverse it ");
        int number = in.nextInt();
        System.out.println(General.reverseNumber(number));
        // testing method of returning number
        System.out.println("enter number ");
        int random = in.nextInt();
        System.out.println(General.randomNumber(random));

        // testing method of generating random number between two numbers
        System.out.println("enter min number");
        int min = in.nextInt();
        System.out.println("enter Max number");
        int max = in.nextInt();
        System.out.println(General.randomNumber(min, max));
        // testing method of generating upper case from A to Z
        System.out.println(General.upperCaseRandomChar('Z'));
        // testing method of generating lower case char from a to z
        System.out.println(General.lowerCaseRandomChar('a'));
        // testing the geniric method
        Integer[] IntArray = {1, 2, 3, 4, 5};
        General.printingArray(IntArray);
        // testing the geniric method
        Character[] CharArray = {'a', 'b', 'c'};
        General.printingArray(CharArray);
        // testing the geniric method
        String[] StringArray = {"sama", "eltohamy", "ahmed"};
        General.printingArray(StringArray);
    }



}

