
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class s091400419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] lst = {a + b, a - b, a * b};
        int max = Collections.max(Arrays.asList(a + b, a - b, a * b));
        System.out.println(max);
    }
}

