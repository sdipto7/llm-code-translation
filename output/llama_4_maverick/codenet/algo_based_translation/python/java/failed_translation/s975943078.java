
import java.util.*;
import java.io.*;

public class s975943078 {
    public static void main(String[] args) throws IOException {
        solve();
    }

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);
        line = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = (Integer.parseInt(line[i]) % K) - 1;
        }
        long[] sum_A = new long[N + 1];
        int count = 0;
        Map<Long, List<Integer>> modK = new HashMap<>();
        modK.put(0L, new ArrayList<>(Arrays.asList(0)));
        for (int i = 0; i < N; i++) {
            sum_A[i + 1] = (sum_A[i] + A[i]) % K;
            if (sum_A[i + 1] < 0) sum_A[i + 1] += K;
            modK.computeIfAbsent(sum_A[i + 1], k -> new ArrayList<>()).add(i + 1);
        }
        for (List<Integer> list : modK.values()) {
            Collections.sort(list);
            int lenK = list.size();
            for (int i = 0; i < lenK; i++) {
                int a = list.get(i);
                int idx = Collections.binarySearch(list, a + K);
                if (idx < 0) idx = -idx - 1;
                count += lenK - idx;
            }
        }
        System.out.println(count);
    }
}

