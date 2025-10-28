
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class s975943078 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = (Integer.parseInt(st.nextToken()) % K) - 1;
        }
        int[] sum_A = new int[N + 1];
        int count = 0;
        HashMap<Integer, List<Integer>> modK = new HashMap<>();
        modK.computeIfAbsent(0, k -> new ArrayList<>()).add(0);
        
        for (int i = 0; i < N; i++) {
            sum_A[i + 1] = (sum_A[i] + A[i]) % K;
            modK.computeIfAbsent(sum_A[i + 1], k -> new ArrayList<>()).add(i + 1);
        }
        
        for (Integer key : modK.keySet()) {
            List<Integer> list = modK.get(key);
            int lenK = list.size();
            for (int i = 0; i < lenK; i++) {
                int a = list.get(i);
                count += bisectLeft(list, a + K, i, lenK) - i - 1;
            }
        }
        
        System.out.println(count);
    }
    
    private static int bisectLeft(List<Integer> list, int x, int low, int high) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}

