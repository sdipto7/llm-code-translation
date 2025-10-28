
import java.util.*;
import java.io.*;

public class atcoder_ABC089_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            S.add(br.readLine());
        }
        List<String> march = Arrays.asList("M", "A", "R", "C", "H");
        int[] march_lis = new int[5];
        for (String s : S) {
            if (march.contains(s.substring(0, 1).toUpperCase())) {
                march_lis[march.indexOf(s.substring(0, 1).toUpperCase())]++;
            }
        }
        int ans = 0;
        for (int x = 0; x < 5; x++) {
            for (int y = x + 1; y < 5; y++) {
                for (int z = y + 1; z < 5; z++) {
                    ans += march_lis[x] * march_lis[y] * march_lis[z];
                }
            }
        }
        System.out.println(ans);
    }
}

