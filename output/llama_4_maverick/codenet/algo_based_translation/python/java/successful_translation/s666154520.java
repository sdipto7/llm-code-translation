
import java.util.Scanner;

public class s666154520 {
    public static void main(String[] args) {
        find_largest_square();
    }

    public static void find_largest_square() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int i = 1;
        while (i < Math.pow(10, 5)) {
            if (i * i > n) {
                System.out.println((long)(i-1) * (i-1));
                System.exit(0);
            }
            i++;
        }
    }
}

