


import java.util.*;
import java.io.*;

public class codeforces_61_B {
    public static boolean valid(int i, int j, int n, int m) {
        if (i < n && i >= 0 && j >= 0 && j < m) return true;
        return false;
    }

    public static double sumn(int i, int n) {
        return (n - i) * (i + n) / 2.0;
    }

    public static double sqfun(double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public static int[] value() throws IOException {
        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        return arr;
    }

    public static int[] values() throws IOException {
        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        return arr;
    }

    public static int[] inlst() throws IOException {
        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        return arr;
    }

    public static int[] inlsts() throws IOException {
        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        return arr;
    }

    public static int inp() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public static int inps() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public static String instr() throws IOException {
        return br.readLine();
    }

    public static String[] stlst() throws IOException {
        return br.readLine().split(" ");
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

    public static void solve() throws IOException {
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(f(br.readLine()));
        }

        Set<String> set = new HashSet<>();
        permute(l, new ArrayList<>(l), set, "");

        int n = inp();
        for (int i = 0; i < n; i++) {
            String s = f(br.readLine());
            if (set.contains(s)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void permute(List<String> l, List<String> temp, Set<String> set, String str) {
        if (temp.isEmpty()) {
            set.add(str);
            return;
        }

        for (String s : l) {
            if (temp.contains(s)) {
                List<String> newTemp = new ArrayList<>(temp);
                newTemp.remove(s);
                permute(l, newTemp, set, str + s);
            }
        }
    }
}

