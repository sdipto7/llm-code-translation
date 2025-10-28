
import java.util.*;
import java.io.*;

public class s664563518 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = new String[N];
        int[] t = new int[N];
        
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            s[i] = input[0];
            t[i] = Integer.parseInt(input[1]);
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
            if (xi < i) {
                ans += t[i];
            }
        }
        
        System.out.println(ans);
    }
}

