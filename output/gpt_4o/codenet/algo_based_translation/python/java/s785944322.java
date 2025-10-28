
import java.util.Scanner;

public class s785944322 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from standard input
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Conditional logic to determine output
        if (a >= 13) {
            // Output the value of b if a is 13 or more
            System.out.println(b);
        } else if (a >= 6) {
            // Output half of b, cast to an integer, if a is between 6 and 12 inclusive
            System.out.println(b / 2);
        } else {
            // Output 0 if a is less than 6
            System.out.println(0);
        }

        scanner.close();
    }
}

