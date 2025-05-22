package pg3;
public class IsNumeric {

    // Function to check if a string contains only numeric characters
    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "123456";
        System.out.println("Is numeric? " + isNumeric(input));
    }
}
