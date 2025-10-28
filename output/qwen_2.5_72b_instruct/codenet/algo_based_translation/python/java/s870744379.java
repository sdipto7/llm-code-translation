
import java.util.Scanner;

public class s870744379 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        checkNumber(n);
        scanner.close();
    }

    public static void checkNumber(int n) {
        if (n >= 1000) {
            System.out.println("ABD");
        } else {
            System.out.println("ABC");
        }
    }
}

