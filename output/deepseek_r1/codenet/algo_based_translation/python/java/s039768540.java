
import java.util.Scanner;

public class s039768540 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        StringBuilder threes = new StringBuilder();
        for (int i = 0; i < x / 100; i++) {
            threes.append('3');
        }
        System.out.println("ai1333" + threes.toString());
    }
}

