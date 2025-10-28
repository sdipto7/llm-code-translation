import java.util.Scanner;
import java.util.Arrays;

public class s197514717 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++) {
            ABC[i] = Integer.parseInt(input[i]);
        }
        int A = ABC[0];
        int B = ABC[1];
        int C = ABC[2];
        int[] numbers = {10 * A + B + C, 10 * B + C + A, 10 * C + A + B};
        int max = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
        System.out.println(max);
    }
}
