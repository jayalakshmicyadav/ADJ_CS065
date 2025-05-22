package pg3;
import java.util.*;

public class StringOperations {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Welcome";
        String str2 = new String("to AIET College");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 3 in str1: " + str1.charAt(3));

        // 3. String Comparison
        String a = "Java";
        String b = "JAVA";
        System.out.println("\nComparing a and b using equals(): " + a.equals(b));
        System.out.println("Comparing a and b using equalsIgnoreCase(): " + a.equalsIgnoreCase(b));

        // 4. String Searching
        String sentence = "AIET is a top engineering college";
        System.out.println("\nDoes the sentence contain 'engineering'? " + sentence.contains("engineering"));
        System.out.println("Index of 'top': " + sentence.indexOf("top"));

        // 5. Substring Operations
        System.out.println("\nSubstring from index 5: " + sentence.substring(5));
        System.out.println("Substring from index 5 to 15: " + sentence.substring(5, 15));

        // 6. String Modification
        System.out.println("\nReplace 'engineering' with 'tech': " + sentence.replace("engineering", "tech"));
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());

        // 7. Whitespace Handling
        String messy = "   Clean Me   ";
        System.out.println("\nBefore trim: '" + messy + "'");
        System.out.println("After trim: '" + messy.trim() + "'");

        // 8. String Concatenation
        String combined = str1 + " " + str2;
        System.out.println("\nConcatenated string using + : " + combined);
        System.out.println("Concatenated string using concat(): " + str1.concat(" ").concat(str2));

        // 9. String Splitting
        String colors = "Red,Green,Blue,Yellow";
        String[] colorArray = colors.split(",");
        System.out.println("\nColors after splitting:");
        for (String color : colorArray) {
            System.out.println(color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to AIET");
        sb.insert(8, " Students");
        sb.replace(0, 7, "Hello");
        sb.delete(5, 14);
        System.out.println("\nStringBuilder result: " + sb.toString());

        // 11. String Formatting
        String student = "Ravi";
        int marks = 85;
        System.out.println("\nFormatted string: " + String.format("Student: %s, Marks: %d", student, marks));

        // 12. Validate Email
        String email = "student@aiet.edu";
        System.out.println("\nEmail: " + email);
        if (email.contains("@") && email.endsWith(".edu") && email.startsWith("student")) {
            System.out.println("✅ Valid email format");
        } else {
            System.out.println("❌ Invalid email format");
        }
    }
}
