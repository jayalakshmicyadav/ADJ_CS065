package pg1b;

import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));

        System.out.println("Original Colors: " + colors);

        // Sorting the ArrayList
        Collections.sort(colors);

        System.out.println("Sorted Colors: " + colors);
    }
}

