package pg1b;

import java.util.*;

public class RemoveNthElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));

        System.out.println("Original Colors: " + colors);

        int n = 3; // For example, delete 3rd element (index 2)
        if (n <= colors.size()) {
            colors.remove(n - 1);
            System.out.println("After removing " + n + "rd element: " + colors);
        } else {
            System.out.println("Invalid index to remove.");
        }
    }
}

