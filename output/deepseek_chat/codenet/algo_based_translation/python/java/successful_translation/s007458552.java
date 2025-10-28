
import java.util.*;
import java.io.*;

public class s007458552 {
    static final long MOD = 1000000007;
    static final double INF = Double.POSITIVE_INFINITY;
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    static int II() throws IOException {
        return Integer.parseInt(br.readLine());
    }
    
    static String SI() throws IOException {
        return br.readLine();
    }
    
    static int[] LI() throws IOException {
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }
    
    static int[] LI_() throws IOException {
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) - 1;
        }
        return arr;
    }
    
    static String[] LS() throws IOException {
        return br.readLine().split(" ");
    }
    
    static String main() throws IOException {
        int n = II();
        String S = SI();
        Map<Character, Integer> counter = new HashMap<>();
        for(char c : S.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        int rCount = counter.getOrDefault('R', 0);
        return rCount > n - rCount ? "Yes" : "No";
    }
    
    public static void main(String[] args) throws IOException {
        System.out.println(main());
    }
}

