import java.util.Scanner;
import java.util.Arrays;

public class s091400419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] lst = {a + b, a - b, a * b};
        int max = Arrays.stream(lst).max().orElse(Integer.MIN_VALUE);
        System.out.println(max);
    }
}
