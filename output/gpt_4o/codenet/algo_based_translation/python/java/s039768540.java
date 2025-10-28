
import java.util.Scanner;

public class s039768540 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(generateString(x));
    }

    public static String generateString(int x) {
        return "ai1333" + "3".repeat(x / 100);
    }
}

