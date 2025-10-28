
import java.util.Scanner;

public class s310981504 {

    public static void main(String[] args) {
        compareAndPrint();
    }

    public static void compareAndPrint() {
        Scanner scanner = new Scanner(System.in);

        // Input Operations
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Control Flow
        if (a <= b) {
            // Output Operations
            System.out.println(a);
        } else {
            // Output Operations
            System.out.println(a - 1);
        }

        scanner.close();
    }
}

