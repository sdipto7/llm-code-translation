
import java.util.*;
import java.io.*;

public class codeforces_134_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] wStr = br.readLine().split(" ");
        int[] w = new int[n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(wStr[i]);
            x += w[i];
        }
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((double)(x - w[i]) / (n - 1) == w[i]) {
                d.add(i + 1);
            }
        }
        System.out.println(d.size());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < d.size(); i++) {
            if (i > 0) result.append(" ");
            result.append(d.get(i));
        }
        System.out.println(result.toString());
    }
}

