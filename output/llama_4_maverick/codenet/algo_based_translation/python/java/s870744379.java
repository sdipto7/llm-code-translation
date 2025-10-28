
import java.util.Scanner;

public class s870744379 {
    public static void determineOutput() {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();
        if (n >= 1000) {
            System.out.println("ABD");
        } else {
            System.out.println("ABC");
        }
    }

    public static void main(String[] args) {
        determineOutput();
    }
}

