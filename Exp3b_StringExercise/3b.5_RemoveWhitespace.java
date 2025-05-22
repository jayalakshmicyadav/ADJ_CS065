package pg3;

public class RemoveWhitespace {

    // Function to remove all whitespace characters from a string
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String input = " AIET   College  Mangalore ";
        System.out.println("Original: '" + input + "'");
        System.out.println("Without whitespace: '" + removeWhitespace(input) + "'");
    }
}

