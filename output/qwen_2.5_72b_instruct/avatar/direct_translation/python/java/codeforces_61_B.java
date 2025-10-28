
import java.util.*;

public class codeforces_61_B {
    static boolean valid(int i, int j, int n, int m) {
        return i < n && i >= 0 && j >= 0 && j < m;
    }

    static double sumn(int i, int n) {
        return (n - i) * (i + n) / 2.0;
    }

    static double sqfun(int a, int b, int c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / 2.0 * a;
    }

    static int[] value() {
        Scanner scanner = new Scanner(System.in);
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    static int[] values() {
        Scanner scanner = new Scanner(System.in);
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    static List<Integer> inlst() {
        Scanner scanner = new Scanner(System.in);
        return Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }

    static List<Integer> inlsts() {
        Scanner scanner = new Scanner(System.in);
        return Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }

    static int inp() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static int inps() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static String instr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static List<String> stlst() {
        Scanner scanner = new Scanner(System.in);
        return Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
    }

    static String f(String s) {
        StringBuilder r = new StringBuilder();
        for (char i : s.toCharArray()) {
            if (i != '-' && i != ';' && i != '_') {
                r.append(Character.toLowerCase(i));
            }
        }
        return r.toString();
    }

    static void solve() {
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(f(instr()));
        }
        List<String> permutations = new ArrayList<>();
        permute(l, 0, permutations);
        int n = inp();
        for (int i = 0; i < n; i++) {
            if (permutations.contains(f(instr()))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    static void permute(List<String> l, int index, List<String> permutations) {
        if (index == l.size() - 1) {
            permutations.add(String.join("", l));
        } else {
            for (int i = index; i < l.size(); i++) {
                Collections.swap(l, index, i);
                permute(l, index + 1, permutations);
                Collections.swap(l, index, i);
            }
        }
    }

    public static void main(String[] args) {
        solve();
    }
}

