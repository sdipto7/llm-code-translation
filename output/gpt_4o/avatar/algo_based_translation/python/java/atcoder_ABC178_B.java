
import java.util.Scanner;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read four integer values from input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // Calculate the product of pairs (a, c), (b, d), (a, d), and (b, c)
        int ac = a * c;
        int bd = b * d;
        int ad = a * d;
        int bc = b * c;

        // Determine the maximum product value among the four calculated products
        int result = Math.max(Math.max(ac, bd), Math.max(ad, bc));

        // Output the result
        System.out.println(result);

        scanner.close();
    }
}

