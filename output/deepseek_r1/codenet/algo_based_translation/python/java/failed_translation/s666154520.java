
import java.util.Scanner;

public class s666154520 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(findLargestSquare(n));
    }

    private static int findLargestSquare(int n) {
        for (int i = 1; i < 100000; i++) {
            if (i * i > n) {
                return (i - 1) * (i - 1);
            }
        }
        return 9999800001;
    }
}

