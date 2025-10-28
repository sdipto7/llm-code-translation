
import java.util.*;

public class s534639230 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] Dstr = scanner.nextLine().split(" ");
        List<Integer> D = new ArrayList<>();
        for (String s : Dstr) {
            D.add(Integer.parseInt(s));
        }

        if (D.get(0) != 0) {
            System.out.println(0);
            return;
        }

        Map<Integer, Integer> cnt = new HashMap<>();
        for (int d : D) {
            cnt.put(d, cnt.getOrDefault(d, 0) + 1);
        }

        if (cnt.getOrDefault(0, 0) > 1) {
            System.out.println(0);
            return;
        }

        int maxD = D.stream().max(Integer::compare).get();

        int mod = 998244353;
        int res = 1;

        for (int i = 1; i <= maxD; i++) {
            int prev = i - 1;
            int prevCount = cnt.getOrDefault(prev, 0);
            if (prevCount == 1) continue;
            int currentCount = cnt.getOrDefault(i, 0);
            long pow = 1;
            for (int j = 0; j < currentCount; j++) {
                pow = (pow * prevCount) % mod;
            }
            res = (int) ((res * pow) % mod);
        }

        System.out.println(res);
    }
}

