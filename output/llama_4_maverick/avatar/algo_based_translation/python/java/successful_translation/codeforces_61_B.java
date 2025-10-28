
import java.util.*;

public class codeforces_61_B {
    public static boolean valid(int i, int j, int n, int m) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }

    public static double sumn(int i, int n) {
        return (double) (n - i) * (i + n) / 2;
    }

    public static double sqfun(double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public static String f(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-' && c != ';' && c != '_') {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        String[] l = new String[3];
        for (int i = 0; i < 3; i++) {
            l[i] = f(scanner.next());
        }
        List<String> permutations = new ArrayList<>();
        permute(l, 0, 2, permutations);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        for (int i = 0; i < n; i++) {
            String input = f(scanner.nextLine());
            boolean found = false;
            for (String perm : permutations) {
                if (perm.equals(input)) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "ACC" : "WA");
        }
    }

    public static void permute(String[] l, int left, int right, List<String> permutations) {
        if (left == right) {
            permutations.add(String.join("", l));
        } else {
            for (int i = left; i <= right; i++) {
                swap(l, left, i);
                permute(l, left + 1, right, permutations);
                swap(l, left, i);
            }
        }
    }

    public static void swap(String[] l, int i, int j) {
        String temp = l[i];
        l[i] = l[j];
        l[j] = temp;
    }

    public static void main(String[] args) {
        solve();
    }
}

