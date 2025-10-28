
import java.util.*;
import java.io.*;

public class codeforces_61_B {

    static boolean valid(int i, int j, int n, int m) {
        return i < n && i >= 0 && j >= 0 && j < m;
    }

    static int sumn(int i, int n) {
        return (n - i) * (i + n) / 2;
    }

    static double sqfun(double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    static int[] value() throws IOException {
        return Arrays.stream(input().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    static int[] values() throws IOException {
        return Arrays.stream(input().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    static List<Integer> inlst() throws IOException {
        return Arrays.stream(input().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }

    static List<Integer> inlsts() throws IOException {
        return Arrays.stream(input().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }

    static int inp() throws IOException {
        return Integer.parseInt(input());
    }

    static int inps() throws IOException {
        return Integer.parseInt(input());
    }

    static String instr() throws IOException {
        return input();
    }

    static List<String> stlst() throws IOException {
        return Arrays.asList(input().split(" "));
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

    static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(f(br.readLine()));
        }
        List<String> listPermutations = new ArrayList<>();
        permute(l, 0, listPermutations);
        int n = inp();
        for (int i = 0; i < n; i++) {
            if (listPermutations.contains(f(instr()))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    static void permute(List<String> arr, int k, List<String> listPermutations) {
        for (int i = k; i < arr.size(); i++) {
            Collections.swap(arr, i, k);
            permute(arr, k + 1, listPermutations);
            Collections.swap(arr, k, i);
        }
        if (k == arr.size() - 1) {
            listPermutations.add(String.join("", arr));
        }
    }

    static String input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}

