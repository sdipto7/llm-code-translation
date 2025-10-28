
import java.util.*;
import java.io.*;

public class s975943078 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int N = Integer.parseInt(tokens[0]);
        int K = Integer.parseInt(tokens[1]);
        
        List<Integer> A = new ArrayList<>();
        tokens = br.readLine().split(" ");
        for (String token : tokens) {
            int num = Integer.parseInt(token);
            int mod = Math.floorMod(num, K);
            A.add(mod - 1);
        }
        
        List<Integer> sumA = new ArrayList<>();
        sumA.add(0);
        for (int i = 0; i < N; i++) {
            int next = Math.floorMod(sumA.get(i) + A.get(i), K);
            sumA.add(next);
        }
        
        Map<Integer, List<Integer>> modK = new HashMap<>();
        modK.put(0, new ArrayList<>(Arrays.asList(0)));
        for (int i = 0; i < N; i++) {
            int currentSum = sumA.get(i + 1);
            if (!modK.containsKey(currentSum)) {
                modK.put(currentSum, new ArrayList<>());
            }
            modK.get(currentSum).add(i + 1);
        }
        
        int count = 0;
        for (int key : modK.keySet()) {
            List<Integer> lst = modK.get(key);
            int lenK = lst.size();
            for (int i = 0; i < lenK; i++) {
                int a = lst.get(i);
                int target = a + K;
                int low = i;
                int high = lenK;
                while (low < high) {
                    int mid = (low + high) / 2;
                    if (lst.get(mid) < target) {
                        low = mid + 1;
                    } else {
                        high = mid;
                    }
                }
                count += (low - i - 1);
            }
        }
        System.out.println(count);
    }
}

