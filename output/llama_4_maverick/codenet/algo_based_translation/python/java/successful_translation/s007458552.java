
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class s007458552 {
    private static final double INF = Double.POSITIVE_INFINITY;
    private static final int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(main(scanner));
    }

    public static String main(Scanner scanner) {
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        String S = scanner.nextLine();
        Map<Character, Integer> C = countCharacters(S);

        return C.get('R') > n - C.get('R') ? "Yes" : "No";
    }

    private static Map<Character, Integer> countCharacters(String S) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : S.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        return countMap;
    }
}

