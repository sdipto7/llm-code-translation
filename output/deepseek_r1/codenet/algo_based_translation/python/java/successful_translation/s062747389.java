
import java.util.Scanner;

public class s062747389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(calculateResult(a, b));
    }

    private static int calculateResult(int a, int b) {
        if (a == b) {
            return a + b;
        } else {
            return 2 * Math.max(a, b) - 1;
        }
    }
}

