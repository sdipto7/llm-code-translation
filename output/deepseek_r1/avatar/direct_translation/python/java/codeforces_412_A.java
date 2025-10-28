
import java.util.*;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String v = scanner.nextLine();
        boolean f = (k - 1) < (n - k);
        int m = Math.min(k - 1, n - k);
        List<String> a = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a.add(f ? "LEFT" : "RIGHT");
        }
        String processedV = v;
        if (!f) {
            processedV = new StringBuilder(v).reverse().toString();
        }
        for (char c : processedV.toCharArray()) {
            a.add("PRINT " + c);
            a.add(f ? "RIGHT" : "LEFT");
        }
        if (!a.isEmpty()) {
            for (int i = 0; i < a.size() - 1; i++) {
                System.out.println(a.get(i));
            }
        }
    }
}

