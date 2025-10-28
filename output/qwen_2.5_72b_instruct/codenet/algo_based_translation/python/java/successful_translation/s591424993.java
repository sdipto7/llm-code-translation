import java.util.*;

public class s591424993 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int g = scanner.nextInt();
        List<List<Integer>> pc = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            List<Integer> innerList = new ArrayList<>();
            innerList.add(scanner.nextInt());
            innerList.add(scanner.nextInt());
            pc.add(innerList);
        }
        scanner.close();

        double ans = Double.POSITIVE_INFINITY;

        for (int bit = 0; bit < (1 << d); bit++) {
            int count = 0;
            int sum = 0;
            Set<Integer> nokori = new HashSet<>();
            for (int j = 1; j <= d; j++) {
                nokori.add(j);
            }

            for (int i = 0; i < d; i++) {
                if ((bit & (1 << i)) != 0) {
                    sum += pc.get(i).get(0) * (i + 1) * 100 + pc.get(i).get(1);
                    count += pc.get(i).get(0);
                    nokori.remove(i + 1);
                }
            }

            if (sum < g) {
                int use = Collections.max(nokori);
                int n = Math.min(pc.get(use - 1).get(0), (int) Math.ceil((double) (g - sum) / (use * 100)));
                count += n;
                sum += n * use * 100;
            }

            if (sum >= g) {
                ans = Math.min(ans, count);
            }
        }

        System.out.println((int) ans);
    }
}
