package pg3;

public class IsNullOrEmpty {

    // Function to check if the string is null or contains only whitespace
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        String input = "   ";  // You can modify this string to test
        if (isNullOrEmpty(input)) {
            System.out.println("The string is null or only contains whitespace.");
        } else {
            System.out.println("The string has content.");
        }
    }
}

