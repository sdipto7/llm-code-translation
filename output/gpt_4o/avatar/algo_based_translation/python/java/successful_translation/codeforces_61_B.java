
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class codeforces_61_B {

    public static boolean valid(int i, int j, int n, int m) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }

    public static double sumn(int i, int n) {
        return (n - i) * (i + n) / 2.0;
    }

    public static double sqfun(double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public static int[] value() throws IOException {
        return Arrays.stream(readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    public static int[] values(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    public static List<Integer> inlst() throws IOException {
        return Arrays.stream(readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
    }

    public static List<Integer> inlsts(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
    }

    public static int inp() throws IOException {
        return Integer.parseInt(readLine());
    }

    public static int inps(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public static String instr() throws IOException {
        return readLine();
    }

    public static List<String> stlst() throws IOException {
        return Arrays.asList(readLine().split("\\s+"));
    }

    public static String f(String s) {
        StringBuilder r = new StringBuilder();
        for (char i : s.toCharArray()) {
            if (i != '-' && i != ';' && i != '_') {
                r.append(Character.toLowerCase(i));
            }
        }
        return r.toString();
    }

    public static void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(f(reader.readLine()));
        }

        List<String> permutations = new ArrayList<>();
        permute(l, 0, permutations);

        int testCases = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testCases; i++) {
            String input = f(reader.readLine());
            if (permutations.contains(input)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    private static void permute(List<String> l, int index, List<String> result) {
        if (index == l.size()) {
            result.add(String.join("", l));
        } else {
            for (int i = index; i < l.size(); i++) {
                Collections.swap(l, i, index);
                permute(l, index + 1, result);
                Collections.swap(l, i, index);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static String readLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}

