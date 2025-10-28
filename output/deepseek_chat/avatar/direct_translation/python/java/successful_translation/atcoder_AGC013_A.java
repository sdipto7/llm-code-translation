
import java.util.*;
import java.io.*;

public class atcoder_AGC013_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> compressed = new ArrayList<>();
        compressed.add(A[0]);
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                compressed.add(A[i]);
            }
        }
        N = compressed.size();
        int i = 1;
        int ans = 0;
        while (i < N - 1) {
            if ((compressed.get(i - 1) < compressed.get(i) && compressed.get(i) > compressed.get(i + 1)) ||
                (compressed.get(i - 1) > compressed.get(i) && compressed.get(i) < compressed.get(i + 1))) {
                ans++;
                i++;
            }
            i++;
        }
        System.out.println(ans + 1);
    }
}

