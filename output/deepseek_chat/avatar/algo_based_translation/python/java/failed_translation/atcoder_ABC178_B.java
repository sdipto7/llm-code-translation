
import java.util.*;
import java.io.*;

public class atcoder_ABC178_B {
    static long inf = 1000000000000000000L;
    static long mod = 1000000007;
    static int[][] dd = {{-1,0}, {0,1}, {1,0}, {0,-1}};
    static int[][] ddn = {{-1,0}, {-1,1}, {0,1}, {1,1}, {1,0}, {1,-1}, {0,-1}, {-1,-1}};
    
    static int[] LI() throws IOException {
        String[] parts = br.readLine().split(" ");
        int[] arr = new int[parts.length];
        for(int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
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
    
    static int main() throws IOException {
        int[] input = LI();
        int a = input[0], b = input[1], c = input[2], d = input[3];
        return Math.max(Math.max(a * c, b * d), Math.max(a * d, b * c));
    }
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        System.out.println(main());
    }
}

