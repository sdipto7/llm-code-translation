import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String v = scanner.nextLine();
        List<String> d = List.of("LEFT", "RIGHT");
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        List<String> a = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a.add(d.get(!f ? 1 : 0));
        }
        String reversedV = new StringBuilder(v).reverse().toString();
        String loopString = f ? reversedV : v;
        for (char i : loopString.toCharArray()) {
            a.add("PRINT " + i);
            a.add(d.get(f ? 1 : 0));
        }
        for (int i = 0; i < a.size() - 1; i++) {
            System.out.println(a.get(i));
        }
        scanner.close();
    }
}
