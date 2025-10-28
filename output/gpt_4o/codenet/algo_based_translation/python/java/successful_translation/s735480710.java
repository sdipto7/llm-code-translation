
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class s735480710 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        // Read the elements as a list of strings
        List<String> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.next());
        }

        // Create a new list b for rearranged elements
        List<String> b = new ArrayList<>();

        // Add elements at odd indices (1, 3, 5, ...) in reverse order
        for (int i = 1; i < a.size(); i += 2) {
            b.add(a.get(i));
        }
        Collections.reverse(b);

        // Add elements at even indices (0, 2, 4, ...)
        for (int i = 0; i < a.size(); i += 2) {
            b.add(a.get(i));
        }

        // Conditional output
        if (a.size() % 2 == 0) {
            // If even, print as is
            System.out.println(String.join(" ", b));
        } else {
            // If odd, print in reverse order
            Collections.reverse(b);
            System.out.println(String.join(" ", b));
        }

        scanner.close();
    }
}

