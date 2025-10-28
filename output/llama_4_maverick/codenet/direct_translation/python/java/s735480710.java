
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class s735480710 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        Deque<String> deque = new ArrayDeque<>();
        if (n % 2 == 0) {
            for (int i = 1; i < n; i += 2) {
                deque.add(a[i]);
            }
            for (int i = 0; i < n; i += 2) {
                deque.add(a[i]);
            }
        } else {
            for (int i = 0; i < n; i += 2) {
                deque.addFirst(a[i]);
            }
            for (int i = 1; i < n; i += 2) {
                deque.addFirst(a[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.poll()).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

