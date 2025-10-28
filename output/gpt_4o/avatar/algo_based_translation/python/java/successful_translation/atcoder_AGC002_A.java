
import java.util.Scanner;

public class atcoder_AGC002_A {

    public static String S(Scanner scanner) {
        return scanner.nextLine().trim();
    }

    public static int I(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine().trim());
    }

    public static int[] LI(Scanner scanner) {
        String[] tokens = scanner.nextLine().trim().split(" ");
        int[] result = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            result[i] = Integer.parseInt(tokens[i]);
        }
        return result;
    }

    public static String[] LS(Scanner scanner) {
        return scanner.nextLine().trim().split(" ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = LI(scanner);
        int a = input[0];
        int b = input[1];

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
}

