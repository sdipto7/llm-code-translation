import java.util.*;
import java.math.*;

public class atcoder_AGC012_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < 3 * n; i++) {
            A.add(sc.nextInt());
        }
        Collections.sort(A);
        long ans = 0;
        for (int i = A.size() - 2; i >= A.size() - 2 * n; i -= 2) {
            ans += A.get(i);
        }
        System.out.println(ans);
    }
}
