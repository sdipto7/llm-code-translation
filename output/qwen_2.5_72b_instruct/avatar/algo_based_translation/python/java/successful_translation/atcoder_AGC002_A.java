
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ab = LI(scanner);
        int a = ab[0];
        int b = ab[1];
        if (a > 0) {
            System.out.println("Positive");
        } else if (a <= 0 && b >= 0) {
            System.out.println("Zero");
        } else {
            if ((a + b) % 2 == 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        }
        scanner.close();
    }

    public static String S(Scanner scanner) {
        return scanner.nextLine().strip();
    }

    public static int I(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public static int[] LI(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().strip().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    public static String[] LS(Scanner scanner) {
        return scanner.nextLine().strip().split(" ");
    }
}

