
import java.util.*;
import java.io.*;

public class atcoder_ABC178_B {
    static int inf = (int)1e20;
    static int mod = (int)1e9 + 7;
    static int[][] dd = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int[][] ddn = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
    
    static int[] LI() throws IOException {
        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        return arr;
    }
    
    static int I() throws IOException {
        return Integer.parseInt(br.readLine());
    }
    
    static double F() throws IOException {
        return Double.parseDouble(br.readLine());
    }
    
    static String[] LS() throws IOException {
        return br.readLine().split(" ");
    }
    
    static String S() throws IOException {
        return br.readLine();
    }
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int[] input = LI();
        int a = input[0], b = input[1], c = input[2], d = input[3];
        System.out.println(Math.max(Math.max(a * c, b * d), Math.max(a * d, b * c)));
    }
}

