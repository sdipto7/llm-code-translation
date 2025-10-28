
import java.util.*;
import java.io.*;

public class codeforces_400_A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    static int[] inlst() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = st.countTokens();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }
    
    static int[] inlsts() throws IOException {
        String[] parts = br.readLine().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        return arr;
    }
    
    static int inp() throws IOException {
        return Integer.parseInt(br.readLine());
    }
    
    static int inps() throws IOException {
        return Integer.parseInt(br.readLine());
    }
    
    static String instr() throws IOException {
        return br.readLine();
    }
    
    static String[] stlst() throws IOException {
        return br.readLine().split(" ");
    }
    
    static boolean help(int a, int b, int[] l) {
        List<int[]> tot = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            int[] segment = new int[a];
            System.arraycopy(l, i * a, segment, 0, a);
            tot.add(segment);
        }
        
        for (int col = 0; col < a; col++) {
            int sum = 0;
            for (int row = 0; row < b; row++) {
                sum += tot.get(row)[col];
            }
            if (sum == b) {
                return true;
            }
        }
        return false;
    }
    
    static void solve() throws IOException {
        List<int[]> tot = new ArrayList<>();
        String x = instr();
        int[] s = new int[x.length()];
        for (int i = 0; i < x.length(); i++) {
            s[i] = (x.charAt(i) == 'O') ? 0 : 1;
        }
        
        for (int i = 1; i <= 12; i++) {
            if (12 % i == 0) {
                int b = 12 / i;
                if (help(i, b, s)) {
                    tot.add(new int[]{b, i});
                }
            }
        }
        
        System.out.print(tot.size() + " ");
        tot.sort((arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        for (int[] pair : tot) {
            System.out.print(pair[0] + "x" + pair[1] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) throws IOException {
        int n = inp();
        for (int i = 0; i < n; i++) {
            solve();
        }
    }
}

