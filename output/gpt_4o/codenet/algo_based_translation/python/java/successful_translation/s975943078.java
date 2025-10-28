
import java.util.*;
import java.io.*;

public class s975943078 {

    public static int solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(tokenizer.nextToken());
        int K = Integer.parseInt(tokenizer.nextToken());
        
        tokenizer = new StringTokenizer(reader.readLine());
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = (Integer.parseInt(tokenizer.nextToken()) % K) - 1;
        }
        
        int[] sum_A = new int[N + 1];
        Arrays.fill(sum_A, 0);
        
        int count = 0;
        Map<Integer, List<Integer>> modK = new HashMap<>();
        modK.put(0, new ArrayList<>(Collections.singletonList(0)));
        
        for (int i = 0; i < N; i++) {
            sum_A[i + 1] = (sum_A[i] + A[i]) % K;
            modK.computeIfAbsent(sum_A[i + 1], k -> new ArrayList<>()).add(i + 1);
        }
        
        for (Map.Entry<Integer, List<Integer>> entry : modK.entrySet()) {
            List<Integer> indices = entry.getValue();
            int lenK = indices.size();
            for (int i = 0; i < lenK; i++) {
                int a = indices.get(i);
                int pos = Collections.binarySearch(indices, a + K);
                if (pos < 0) {
                    pos = -pos - 1;
                }
                count += pos - i - 1;
            }
        }
        
        System.out.println(count);
        return 0;
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}

