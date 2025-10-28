
import java.util.*;
import java.io.*;

public class atcoder_ABC105_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        long[] cum = new long[N + 1];
        cum[0] = 0;
        for (int i = 1; i <= N; i++) {
            long aMod = (A[i - 1] % M + M) % M;
            cum[i] = (cum[i - 1] + aMod) % M;
        }
        Map<Long, Integer> remainderCounts = new HashMap<>();
        for (long rem : cum) {
            remainderCounts.put(rem, remainderCounts.getOrDefault(rem, 0) + 1);
        }
        long combinations = 0;
        for (int count : remainderCounts.values()) {
            combinations += (long) count * (count - 1) / 2;
        }
        System.out.println(combinations);
    }
}

