
import java.util.*;
import java.io.*;

public class codeforces_624_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tokens[i]);
        }
        double pre = Double.POSITIVE_INFINITY;
        int ans = 0;
        Integer[] arr = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        for (int j = 0; j < n; j++) {
            int val = Math.max(0, Math.min((int)(pre - 1), arr[j]));
            ans += val;
            pre = Math.max(0, Math.min(pre - 1, arr[j]));
        }
        System.out.println(ans);
    }
}

