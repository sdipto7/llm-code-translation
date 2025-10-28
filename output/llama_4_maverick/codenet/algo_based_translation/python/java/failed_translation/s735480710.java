
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class s735480710 {
    public static void processSequence() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = scanner.nextLine().trim().split("\\s+");
        if (a.length == 0) {
            a = scanner.nextLine().trim().split("\\s+");
        }
        String[] b = new String[a.length];
        int k = 0;
        for (int i = a.length - 1; i >= 0; i -= 2) {
            b[k++] = a[i];
        }
        for (int i = 0; i < a.length; i += 2) {
            b[k++] = a[i];
        }
        if (a.length % 2 == 0) {
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i]);
                if (i < b.length - 1) {
                    System.out.print(" ");
                }
            }
        } else {
            for (int i = b.length - 1; i >= 0; i--) {
                System.out.print(b[i]);
                if (i > 0) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        processSequence();
    }
}

