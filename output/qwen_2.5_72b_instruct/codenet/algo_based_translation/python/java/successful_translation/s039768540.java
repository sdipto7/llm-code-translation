
import java.util.Scanner;

public class s039768540 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = x / 100;
        StringBuilder result = new StringBuilder("ai1333");
        for (int i = 0; i < count; i++) {
            result.append("3");
        }
        System.out.println(result.toString());
        scanner.close();
    }
}

