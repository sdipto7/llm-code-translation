
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_408_B {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<Character, Integer> boughtCount = new HashMap<>();
        for (char c : line.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }

        line = scanner.nextLine();
        Map<Character, Integer> madeCout = new HashMap<>();
        for (char c : line.toCharArray()) {
            madeCout.put(c, madeCout.getOrDefault(c, 0) + 1);
        }

        int res = 0;
        for (char color : madeCout.keySet()) {
            if (!boughtCount.containsKey(color)) {
                System.out.println(-1);
                return;
            }
            res += Math.min(boughtCount.get(color), madeCout.get(color));
        }
        System.out.println(res);
    }
}

