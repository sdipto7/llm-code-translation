
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class codeforces_408_B {
    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<Character, Integer> boughtCount = new HashMap<>();
        for (char c : line.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        line = scanner.nextLine();
        Map<Character, Integer> madeCount = new HashMap<>();
        for (char c : line.toCharArray()) {
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for (Map.Entry<Character, Integer> entry : madeCount.entrySet()) {
            char color = entry.getKey();
            if (!boughtCount.containsKey(color)) {
                System.out.println(-1);
                return;
            }
            res += Math.min(boughtCount.get(color), entry.getValue());
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int t = 1;
        for (int i = 0; i < t; i++) {
            solution();
        }
    }
}

