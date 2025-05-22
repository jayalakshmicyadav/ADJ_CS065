package pg2;

import java.util.*;

public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Java Programming");

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);

        // 2. Length and Character Access
        System.out.println("\nLength of str3: " + str3.length());
        System.out.println("Character at index 5 of str3: " + str3.charAt(5));

        // 3. String Comparison
        System.out.println("\nComparing str1 and str2: " + str1.equals(str2));
        System.out.println("Comparing 'hello' and 'Hello' ignoring case: " + "hello".equalsIgnoreCase("Hello"));

        // 4. String Searching
        System.out.println("\nDoes str3 contain 'Java'? " + str3.contains("Java"));
        System.out.println("Index of 'Programming' in str3: " + str3.indexOf("Programming"));

        // 5. Substring Operations
        System.out.println("\nSubstring from index 5 in str3: " + str3.substring(5));
        System.out.println("Substring from index 5 to 15 in str3: " + str3.substring(5, 15));

        // 6. String Modification
        System.out.println("\nReplace 'Java' with 'Python': " + str3.replace("Java", "Python"));
        System.out.println("Convert str3 to lowercase: " + str3.toLowerCase());
        System.out.println("Convert str3 to uppercase: " + str3.toUpperCase());

        // 7. Whitespace Handling
        String strWithSpaces = "   Trim This String   ";
        System.out.println("\nOriginal string with spaces: '" + strWithSpaces + "'");
        System.out.println("After trim(): '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String full = str1 + " " + str2;
        System.out.println("\nConcatenated using + : " + full);
        System.out.println("Concatenated using concat(): " + str1.concat(" ").concat(str2));

        // 9. String Splitting
        String fruits = "Apple,Banana,Mango,Orange";
        String[] fruitArray = fruits.split(",");
        System.out.println("\nSplitting fruits string:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo (for mutable strings)
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to Java");
        sb.insert(8, "Everyone ");
        sb.replace(0, 7, "Hi");
        sb.delete(3, 11);
        System.out.println("\nStringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 25;
        System.out.println("\nFormatted String: " + String.format("Name: %s, Age: %d", name, age));

        // 12. Email Validation using contains(), startsWith(), endsWith()
        String email = "example@gmail.com";
        System.out.println("\nEmail: " + email);
        if (email.contains("@") && email.endsWith(".com") && email.startsWith("example")) {
            System.out.println("Email is valid format.");
        } else {
            System.out.println("Email is invalid.");
        }
    }
}
