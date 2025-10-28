
import java.util.*;

public class codeforces_61_B {
    static boolean valid(int i, int j, int n, int m) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }

    static double sumn(int i, int n) {
        return (n - i) * (double) (i + n) / 2;
    }

    static double sqfun(double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    static int[] value() {
        String[] s = new Scanner(System.in).nextLine().split(" ");
        int[] a = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        return a;
    }

    static int inp() {
        return new Scanner(System.in).nextInt();
    }

    static String instr() {
        return new Scanner(System.in).nextLine();
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

    public static void main(String[] args) {
        String[] l = new String[3];
        for (int i = 0; i < 3; i++) {
            l[i] = f(instr());
        }
        List<String> list = new ArrayList<>();
        permute(l, 0, l.length - 1, list);
        int n = inp();
        for (int i = 0; i < n; i++) {
            String s = f(instr());
            if (list.contains(s)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    static void permute(String[] str, int l, int r, List<String> list) {
        if (l == r) {
            StringBuilder sb = new StringBuilder();
            for (String s : str) {
                sb.append(s);
            }
            list.add(sb.toString());
        } else {
            for (int i = l; i <= r; i++) {
                swap(str, l, i);
                permute(str, l + 1, r, list);
                swap(str, l, i);
            }
        }
    }

    static void swap(String[] str, int i, int j) {
        String temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}

