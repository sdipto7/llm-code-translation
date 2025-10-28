
import java.io.*;
import java.util.*;

public class s975943078 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        String[] NK = br.readLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);
        String[] As = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = (Integer.parseInt(As[i]) % K) - 1;
        }
        long[] sum_A = new long[N + 1];
        sum_A[0] = 0;
        for (int i = 0; i < N; i++) {
            sum_A[i + 1] = (sum_A[i] + A[i]) % K;
        }
        Map<Long, List<Integer>> modK = new HashMap<>();
        for (int i = 0; i <= N; i++) {
            modK.computeIfAbsent(sum_A[i], k -> new ArrayList<>()).add(i);
        }
        long count = 0;
        for (List<Integer> list : modK.values()) {
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                int idx = Collections.binarySearch(list, list.get(i) + K);
                if (idx < 0) idx = -idx - 1;
                count += list.size() - idx;
            }
        }
        pw.println(count);
        pw.flush();
    }
}

