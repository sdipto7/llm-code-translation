import java.util.*;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> low = new ArrayList<>();
        List<Integer> high = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            low.add(a);
            high.add(b);
        }
        Collections.sort(low);
        Collections.sort(high);
        if (n % 2 == 1) {
            System.out.println(high.get((n + 1) / 2 - 1) - low.get((n + 1) / 2 - 1) + 1);
        } else {
            double hh = (high.get(n / 2 - 1) + high.get(n / 2)) / 2.0;
            double ll = (low.get(n / 2 - 1) + low.get(n / 2)) / 2.0;
            System.out.println((int)((hh - ll) * 2) + 1);
        }
    }
}
