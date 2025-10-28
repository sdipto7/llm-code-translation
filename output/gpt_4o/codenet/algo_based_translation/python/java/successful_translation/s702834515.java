
import java.util.Scanner;

public class s702834515 {

    public static int calculateSumOfNonFizzBuzzNumbers(int n) {
        int r = 0;
        for (int ii = 0; ii < n; ii++) {
            if ((ii + 1) % 3 != 0 && (ii + 1) % 5 != 0) {
                r += (ii + 1);
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int result = calculateSumOfNonFizzBuzzNumbers(n);
        System.out.println(result);
    }
}

