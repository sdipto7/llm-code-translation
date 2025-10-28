
import java.util.*;

public class s878873709 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> s = new HashSet<>();
        int[] vals = {1, 2, 4, 8, 16, 32, 64};
        for (int val : vals) {
            s.add(val);
        }
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (s.contains(i)) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}

