
import java.util.*;
import java.io.*;

public class atcoder_ABC106_C {
    static long inf = 1000000000000000000L;
    static double eps = 1.0 / 10000000000.0;
    static int mod = 1000000007;
    static int[][] dd = {{-1,0},{0,1},{1,0},{0,-1}};
    static int[][] ddn = {{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    
    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    
    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
    
    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
    
    static String nextLine() throws IOException {
        return br.readLine().trim();
    }
    
    static int[] LI() throws IOException {
        String[] parts = nextLine().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++)
            arr[i] = Integer.parseInt(parts[i]);
        return arr;
    }
    
    static int[] LI_() throws IOException {
        String[] parts = nextLine().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++)
            arr[i] = Integer.parseInt(parts[i]) - 1;
        return arr;
    }
    
    static double[] LF() throws IOException {
        String[] parts = nextLine().split(" ");
        double[] arr = new double[parts.length];
        for (int i = 0; i < parts.length; i++)
            arr[i] = Double.parseDouble(parts[i]);
        return arr;
    }
    
    static String[] LS() throws IOException {
        return nextLine().split(" ");
    }
    
    static int I() throws IOException {
        return Integer.parseInt(nextLine());
    }
    
    static double F() throws IOException {
        return Double.parseDouble(nextLine());
    }
    
    static String S() throws IOException {
        return nextLine();
    }
    
    static void pf(String s) {
        System.out.println(s);
        System.out.flush();
    }
    
    static String main() throws IOException {
        String s = S();
        int k = I();
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c != '1') break;
            l++;
        }
        if (l >= k) return "1";
        return String.valueOf(s.charAt(l));
    }
    
    public static void main(String[] args) throws IOException {
        System.out.println(main());
    }
}

