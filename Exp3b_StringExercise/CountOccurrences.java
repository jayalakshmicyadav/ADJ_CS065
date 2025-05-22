package pg3;

public class CountOccurrences {

    // Function to count how many times a substring appears
    public static int countOccurrences(String main, String sub) {
        int count = 0;
        int index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String mainString = "aiet is in aiet and aiet rocks";
        String subString = "aiet";
        int result = countOccurrences(mainString, subString);
        System.out.println("The substring '" + subString + "' appears " + result + " times.");
    }
}
