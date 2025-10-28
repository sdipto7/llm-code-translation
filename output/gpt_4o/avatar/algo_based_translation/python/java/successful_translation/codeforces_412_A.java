
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integers n and k from input
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        // Read the string v from input
        String v = scanner.nextLine();

        // Initialize variables
        String[] d = {"LEFT", "RIGHT"};
        boolean f = (k - 1) < (n - k);
        int m = Math.min(k - 1, n - k);
        List<String> a = new ArrayList<>();

        // Append direction steps to a
        for (int i = 0; i < m; i++) {
            a.add(d[f ? 0 : 1]);
        }

        // Traverse the string v in the order determined by f
        if (f) {
            for (int i = 0; i < v.length(); i++) {
                a.add("PRINT " + v.charAt(i));
                a.add(d[1]);
            }
        } else {
            for (int i = v.length() - 1; i >= 0; i--) {
                a.add("PRINT " + v.charAt(i));
                a.add(d[0]);
            }
        }

        // Output each element of a except the last one, separated by newlines
        for (int i = 0; i < a.size() - 1; i++) {
            System.out.println(a.get(i));
        }

        scanner.close();
    }
}

