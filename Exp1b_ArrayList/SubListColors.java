package pg1b;

import java.util.*;

public class SubListColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("All Colors: " + colors);

        // Extracting 1st and 2nd elements (index 0 and 1)
        List<String> subColors = colors.subList(0, 2);

        System.out.println("Extracted Colors: " + subColors);
    }
}
