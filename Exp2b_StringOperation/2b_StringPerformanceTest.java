package pg2;
public class StringPerformanceTest {
    public static void main(String[] args) {
        final int iterations = 10000;
        String text = "AIET";

        // Test with StringBuffer
        long startTime1 = System.nanoTime();
        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuffer.append(text);
        }
        long endTime1 = System.nanoTime();
        long durationBuffer = endTime1 - startTime1;
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

        // Test with StringBuilder
        long startTime2 = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbuilder.append(text);
        }
        long endTime2 = System.nanoTime();
        long durationBuilder = endTime2 - startTime2;
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

        // Final result
        if (durationBuilder < durationBuffer) {
            System.out.println("\n✅ StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("\n✅ StringBuffer is faster than StringBuilder.");
        }
    }
}
