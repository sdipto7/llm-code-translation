
import java.util.*;
import java.io.*;

public class s664563518 {
    static boolean show_flg = false;
    static final String[] YN = {"No", "Yes"};
    static final long MOD = 1000000007;
    static final double inf = Double.POSITIVE_INFINITY;
    static final int IINF = 1000000000;
    static final String l_alp = "abcdefghijklmnopqrstuvwxyz";
    static final String u_alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    static int I() throws IOException {
        return Integer.parseInt(br.readLine());
    }
    
    static int[] MI() throws IOException {
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }
    
    static int[] LI() throws IOException {
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }
    
    static int[] LI_() throws IOException {
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) - 1;
        }
        return arr;
    }
    
    static int[] StoI() throws IOException {
        String s = br.readLine();
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - 'a';
        }
        return arr;
    }
    
    static char ItoS(int nn) {
        return (char)(nn + 'a');
    }
    
    static void show(Object... inp) {
        if (show_flg) {
            for (Object obj : inp) {
                System.out.print(obj + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) throws IOException {
        int N = I();
        String[] s = new String[N];
        int[] t = new int[N];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            s[i] = st.nextToken();
            t[i] = Integer.parseInt(st.nextToken());
        }
        
        String X = br.readLine();
        int xi = 0;
        
        for (int i = 0; i < N; i++) {
            if (s[i].equals(X)) {
                xi = i;
                break;
            }
        }
        
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (i > xi) {
                ans += t[i];
            }
        }
        
        System.out.println(ans);
    }
}

