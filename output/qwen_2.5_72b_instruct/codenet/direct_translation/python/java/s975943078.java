import java.util.*;

public class s975943078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = (scanner.nextInt() % K) - 1;
        }
        int[] sum_A = new int[N + 1];
        int count = 0;
        Map<Integer, List<Integer>> modK = new HashMap<>();
        modK.put(0, new ArrayList<>(Collections.singletonList(0)));
        for (int i = 0; i < N; i++) {
            sum_A[i + 1] = (sum_A[i] + A[i]) % K;
            if (!modK.containsKey(sum_A[i + 1])) {
                modK.put(sum_A[i + 1], new ArrayList<>());
            }
            modK.get(sum_A[i + 1]).add(i + 1);
        }
        for (int key : modK.keySet()) {
            List<Integer> list = modK.get(key);
            int lenK = list.size();
            for (int i = 0; i < lenK; i++) {
                int a = list.get(i);
                int index = Collections.binarySearch(list.subList(i, lenK), a + K);
                if (index < 0) {
                    index = -(index + 1);
                }
                count += index - 1;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
