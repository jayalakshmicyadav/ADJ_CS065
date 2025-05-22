package pg3;

public class ReverseString {

    // Function to reverse the characters of a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "JavaProgramming";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverseString(input));
    }
}

