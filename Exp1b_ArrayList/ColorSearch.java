package pg1b;
import java.util.*;

public class ColorSearch {
    public static void main(String[] args) {
        // Creating an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Displaying the colors
        System.out.println("Colors: " + colors);

        // Searching for "Red"
        if (colors.contains("Red")) {
            System.out.println("\"Red\" is available in the list.");
        } else {
            System.out.println("\"Red\" is not found in the list.");
        }
    }
}

