package pg3;

public class Truncate {

    // Function to truncate a string and add ellipsis
    public static String truncate(String str, int maxLength) {
        if (str.length() <= maxLength) {
            return str;
        } else {
            return str.substring(0, maxLength - 3) + "...";
        }
    }

    public static void main(String[] args) {
        String input = "Artificial Intelligence and Machine Learning";
        int maxLen = 20;
        System.out.println("Truncated: " + truncate(input, maxLen));
    }
}
