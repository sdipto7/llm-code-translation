
import java.util.*;

public class codeforces_61_B {
    private static Scanner scanner = new Scanner(System.in);

    public static boolean valid(int i, int j, int n, int m) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }

    public static double sumn(int i, int n) {
        return ((double)(n - i) * (i + n)) / 2.0;
    }

    public static double sqfun(double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public static String f(String s) {
        StringBuilder r = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-' && c != ';' && c != '_') {
                r.append(Character.toLowerCase(c));
            }
        }
        return r.toString();
    }

    public static void solve() {
        List<String> inputs = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            inputs.add(f(scanner.nextLine()));
        }

        Set<String> permutations = new HashSet<>();
        String s0 = inputs.get(0);
        String s1 = inputs.get(1);
        String s2 = inputs.get(2);
        permutations.add(s0 + s1 + s2);
        permutations.add(s0 + s2 + s1);
        permutations.add(s1 + s0 + s2);
        permutations.add(s1 + s2 + s0);
        permutations.add(s2 + s0 + s1);
        permutations.add(s2 + s1 + s0);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String test = f(scanner.nextLine());
            System.out.println(permutations.contains(test) ? "ACC" : "WA");
        }
    }

    public static void main(String[] args) {
        solve();
    }
}

