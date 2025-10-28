
import java.util.*;
import java.io.*;

public class codeforces_61_B {
    public static boolean valid(int i, int j, int n, int m) {
        return i < n && i >= 0 && j >= 0 && j < m;
    }

    public static double sumn(int i, int n) {
        return (n - i) * (i + n) / 2.0;
    }

    public static double sqfun(double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public static int[] value() throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] values() throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static List<Integer> inlst() throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        return list;
    }

    public static List<Integer> inlsts() throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        return list;
    }

    public static int inp() throws IOException {
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    public static int inps() throws IOException {
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    public static String instr() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static List<String> stlst() throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        List<String> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        return list;
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
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(f(instr()));
        }
        List<String> permutedList = new ArrayList<>();
        permute(l, "", permutedList);
        int testCases = inp();
        for (int i = 0; i < testCases; i++) {
            if (permutedList.contains(f(instr()))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    private static void permute(List<String> list, String prefix, List<String> result) {
        if (list.size() == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < list.size(); i++) {
                List<String> remaining = new ArrayList<>(list);
                remaining.remove(i);
                permute(remaining, prefix + list.get(i), result);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}

