
import java.util.*;
import java.io.*;

public class atcoder_ABC106_C {
    static int inf = (int) Math.pow(10, 20);
    static double eps = 1.0 / Math.pow(10, 10);
    static int mod = (int) Math.pow(10, 9) + 7;
    static int[][] dd = { {-1, 0}, {0, 1}, {1, 0}, {0, -1} };
    static int[][] ddn = { {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1} };

    public static List<Integer> LI(BufferedReader br) throws IOException {
        String[] tokens = br.readLine().split(" ");
        List<Integer> result = new ArrayList<>();
        for (String token : tokens) {
            result.add(Integer.parseInt(token));
        }
        return result;
    }

    public static List<Integer> LI_(BufferedReader br) throws IOException {
        String[] tokens = br.readLine().split(" ");
        List<Integer> result = new ArrayList<>();
        for (String token : tokens) {
            result.add(Integer.parseInt(token) - 1);
        }
        return result;
    }

    public static List<Double> LF(BufferedReader br) throws IOException {
        String[] tokens = br.readLine().split(" ");
        List<Double> result = new ArrayList<>();
        for (String token : tokens) {
            result.add(Double.parseDouble(token));
        }
        return result;
    }

    public static List<String> LS(BufferedReader br) throws IOException {
        return Arrays.asList(br.readLine().split(" "));
    }

    public static int I(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public static double F(BufferedReader br) throws IOException {
        return Double.parseDouble(br.readLine());
    }

    public static String S(BufferedReader br) throws IOException {
        return br.readLine();
    }

    public static void pf(String s) {
        System.out.println(s);
    }

    public static char main(BufferedReader br) throws IOException {
        String s = S(br);
        int k = I(br);
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c != '1') {
                break;
            }
            l++;
        }
        if (l >= k) {
            return '1';
        }
        return s.charAt(l);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(main(br));
    }
}

