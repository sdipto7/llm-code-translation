
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class s975943078 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(a -> (Integer.parseInt(a) % K) - 1).toArray();
        int[] sum_A = new int[N + 1];
        Map<Integer, List<Integer>> modK = new HashMap<>();
        modK.put(0, new ArrayList<>(Collections.singletonList(0)));
        for (int i = 0; i < N; i++) {
            sum_A[i + 1] = (sum_A[i] + A[i]) % K;
            modK.computeIfAbsent(sum_A[i + 1], k -> new ArrayList<>()).add(i + 1);
        }
        long count = 0;
        for (Map.Entry<Integer, List<Integer>> entry : modK.entrySet()) {
            List<Integer> list = entry.getValue();
            int lenK = list.size();
            for (int i = 0; i < lenK; i++) {
                int a = list.get(i);
                int idx = Collections.binarySearch(list, a + K);
                if (idx < 0) idx = -idx - 1;
                count += idx - i - 1;
            }
        }
        System.out.println(count);
    }
}

