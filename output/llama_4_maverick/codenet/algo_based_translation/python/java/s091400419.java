
import java.util.Scanner;

public class s091400419 {
    public static void main(String[] args) {
        int[] input = getUserInput();
        int result = calculateMaxResult(input[0], input[1]);
        System.out.println(result);
    }

    public static int[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        scanner.close();
        return new int[]{a, b};
    }

    public static int calculateMaxResult(int a, int b) {
        int[] results = new int[]{a + b, a - b, a * b};
        int max = results[0];
        for (int i = 1; i < results.length; i++) {
            if (results[i] > max) {
                max = results[i];
            }
        }
        return max;
    }
}

