
import java.util.*;
import java.io.*;

public class codeforces_624_B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());
        int[] a = Arrays.stream(reader.readLine().trim().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        
        double pre = Double.POSITIVE_INFINITY;
        int ans = 0;

        Arrays.sort(a);
        for (int j = n - 1; j >= 0; j--) {
            int maxValue = (int) Math.max(0, Math.min(pre - 1, a[j]));
            ans += maxValue;
            pre = maxValue;
        }
        
        System.out.println(ans);
    }
}

