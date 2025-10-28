
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = _input(scanner);
        int n = input[0];
        int m = input[1];
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = input[i + 2];
        }
        Map<Integer, Integer> l = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!l.containsKey(lst[i])) {
                l.put(lst[i], 1);
            } else {
                l.put(lst[i], l.get(lst[i]) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l.get(lst[i]) > 1) {
                res += n - i - l.get(lst[i]);
                l.put(lst[i], l.get(lst[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
        scanner.close();
    }

    public static int[] _input(Scanner scanner) {
        String[] line = scanner.nextLine().split(" ");
        int[] result = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            result[i] = Integer.parseInt(line[i]);
        }
        return result;
    }
}

