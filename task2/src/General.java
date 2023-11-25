public class General {
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
    public static int randomNumber(int num) {
        return (int) (Math.random() * (num + 1));
    }

    // method of generating  random number between two numbers
    public static int randomNumber(int min, int max) {
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
    public static <T> void printingArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
