
import java.util.Scanner;

public class s310981504 {
    public static void main(String[] args) {
        processInput();
    }

    public static void processInput() {
        Scanner scanner = new Scanner(System.in);
        String[] inputParts = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputParts[0]);
        int b = Integer.parseInt(inputParts[1]);

        if (a <= b) {
            System.out.println(a);
        } else {
            System.out.println(a - 1);
        }
        scanner.close();
    }
}

