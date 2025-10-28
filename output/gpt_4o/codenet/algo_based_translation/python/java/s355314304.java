
import java.util.Scanner;

public class s355314304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = calculateDifference(n);
        System.out.println(result);
        scanner.close();
    }

    public static int calculateDifference(int n) {
        if (n % 1000 == 0) {
            return 0;
        } else {
            return 1000 - (n % 1000);
        }
    }
}

