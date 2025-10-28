
import java.util.*;

public class codeforces_131_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] parts = sc.nextLine().split(" ");
        Map<Integer, Integer> map = new HashMap<>();
        for (String s : parts) {
            int num = Integer.parseInt(s);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        long c = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            if (key == 0) {
                c += (long) count * (count - 1);
            } else {
                if (map.containsKey(-key)) {
                    c += (long) count * map.get(-key);
                }
            }
        }
        c /= 2;
        System.out.println(c);
    }
}

