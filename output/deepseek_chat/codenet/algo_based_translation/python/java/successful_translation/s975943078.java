
import java.util.*;
import java.io.*;

public class s975943078 {
    public static void main(String[] args) throws IOException {
        solve();
    }
    
    public static int solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            A[i] = (num % K) - 1;
        }
        
        int[] sum_A = new int[N + 1];
        int count = 0;
        Map<Integer, List<Integer>> modK = new HashMap<>();
        modK.put(0, new ArrayList<>());
        modK.get(0).add(0);
        
        for (int i = 0; i < N; i++) {
            sum_A[i + 1] = (sum_A[i] + A[i]) % K;
            int currentSum = sum_A[i + 1];
            if (!modK.containsKey(currentSum)) {
                modK.put(currentSum, new ArrayList<>());
            }
            modK.get(currentSum).add(i + 1);
        }
        
        for (int key : modK.keySet()) {
            List<Integer> list = modK.get(key);
            int lenK = list.size();
            for (int i = 0; i < lenK; i++) {
                int a = list.get(i);
                int target = a + K;
                int left = i;
                int right = lenK;
                
                while (left < right) {
                    int mid = left + (right - left) / 2;
                    if (list.get(mid) < target) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                
                count += (left - i - 1);
            }
        }
        
        System.out.println(count);
        return 0;
    }
}

