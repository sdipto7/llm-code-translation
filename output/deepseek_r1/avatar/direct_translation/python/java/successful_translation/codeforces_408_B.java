
import java.util.*;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boughtStr = scanner.nextLine();
        String madeStr = scanner.nextLine();
        Map<Character, Integer> boughtCount = new HashMap<>();
        for (char c : boughtStr.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> madeCount = new HashMap<>();
        for (char c : madeStr.toCharArray()) {
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for (Map.Entry<Character, Integer> entry : madeCount.entrySet()) {
            char color = entry.getKey();
            int madeCnt = entry.getValue();
            if (!boughtCount.containsKey(color)) {
                System.out.println(-1);
                return;
            }
            res += Math.min(boughtCount.get(color), madeCnt);
        }
        System.out.println(res);
    }
}

