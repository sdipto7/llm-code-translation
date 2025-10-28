
import java.util.Scanner;

public class s858647829 {
    public static void checkDivisibility() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        if (a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        checkDivisibility();
    }
}

