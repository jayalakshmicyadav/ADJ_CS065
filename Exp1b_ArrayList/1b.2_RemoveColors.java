package pg1b;
import java.util.*;

public class RemoveColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));

        // Display original list
        System.out.println("Original Colors: " + colors);

        // Remove 2nd element (index 1)
        colors.remove(1);

        // Remove "Blue"
        colors.remove("Blue");

        // Display updated list
        System.out.println("Updated Colors: " + colors);
    }
}

