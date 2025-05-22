package pg3;

public class CountWords {

    // Function to count the number of words in a string
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "Welcome to AIET Mangalore";
        System.out.println("Word count: " + countWords(input));
    }
}

