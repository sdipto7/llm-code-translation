
import java.util.*;
import java.io.*;

public class s344468705 {
    static final long INF = 1000000000000000000L;
    static final int MOD = 1000000007;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    static String getS() throws IOException {
        return br.readLine().trim();
    }
    
    static int getN() throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }
    
    static int[] getList() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = st.countTokens();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }
    
    static int[] getZList() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = st.countTokens();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) - 1;
        }
        return arr;
    }
    
    static void solve() throws IOException {
        int n = getN();
        ArrayList<Long> dp = new ArrayList<>();
        dp.add(-INF);
        
        for (int i = 0; i < n; i++) {
            int num = getN();
            long negNum = -num;
            
            if (negNum >= dp.get(dp.size() - 1)) {
                dp.add(negNum);
            } else {
                int idx = Collections.binarySearch(dp, negNum);
                if (idx < 0) {
                    idx = -idx - 1;
                } else {
                    while (idx < dp.size() && dp.get(idx) == negNum) {
                        idx++;
                    }
                }
                dp.set(idx, negNum);
            }
        }
        
        System.out.println(dp.size() - 1);
    }
    
    static void main() throws IOException {
        int n = getN();
        for (int i = 0; i < n; i++) {
            solve();
        }
    }
    
    public static void main(String[] args) throws IOException {
        solve();
    }
}

