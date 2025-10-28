
import java.util.Scanner;

public class s423256012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(calculateAverage(A, B));
        scanner.close();
    }

    public static String calculateAverage(int A, int B) {
        int totalSum = A + B;
        if (totalSum % 2 == 1) {
            return "IMPOSSIBLE";
        } else {
            return String.valueOf(totalSum / 2);
        }
    }
}

