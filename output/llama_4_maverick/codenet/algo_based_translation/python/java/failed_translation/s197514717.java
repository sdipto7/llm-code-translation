
import java.util.Scanner;

public class s197514717 {
    public static void main(String[] args) {
        System.out.println(getMaxValue());
    }

    public static int getMaxValue() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] ABC = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            ABC[i] = Integer.parseInt(input[i]);
        }
        int A = ABC[0];
        int B = ABC[1];
        int C = ABC[2];
        int[] values = {10 * A + B + C, 10 * B + C + A, 10 * C + A + B};
        int maxValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }
        System.out.println(maxValue);
        return maxValue;
    }
}

