
import java.util.*;

public class atcoder_AGC013_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        List<Integer> compressed = new ArrayList<>();
        if (!A.isEmpty()) {
            compressed.add(A.get(0));
            for (int i = 1; i < A.size(); i++) {
                if (!A.get(i).equals(compressed.get(compressed.size() - 1))) {
                    compressed.add(A.get(i));
                }
            }
        }
        int newN = compressed.size();
        int ans = 0;
        int i = 1;
        while (i < newN - 1) {
            int prev = compressed.get(i - 1);
            int curr = compressed.get(i);
            int next = compressed.get(i + 1);
            if ((prev < curr && curr > next) || (prev > curr && curr < next)) {
                ans++;
                i++;
            }
            i++;
        }
        System.out.println(ans + 1);
        sc.close();
    }
}

