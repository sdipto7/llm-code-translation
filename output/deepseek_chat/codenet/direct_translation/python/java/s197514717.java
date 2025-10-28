
import java.util.Scanner;
import java.util.Arrays;

public class s197514717 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int A = ABC[0];
        int B = ABC[1];
        int C = ABC[2];
        System.out.println(Math.max(10 * A + B + C, Math.max(10 * B + C + A, 10 * C + A + B)));
    }
}

