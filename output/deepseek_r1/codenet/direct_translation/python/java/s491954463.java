
import java.util.*;

public class s491954463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a.add(sc.nextInt());
            b.add(sc.nextInt());
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(Collections.frequency(a, i) + Collections.frequency(b, i));
        }
    }
}

