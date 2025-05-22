package pg3;

import java.util.Random;

public class GenerateRandomString {

    // Function to generate a random string of specified length
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(rand.nextInt(characters.length())));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int length = 10;
        System.out.println("Random String: " + generateRandomString(length));
    }
}
