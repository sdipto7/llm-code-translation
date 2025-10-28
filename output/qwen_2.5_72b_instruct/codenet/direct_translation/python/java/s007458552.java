import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class s007458552 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String S = scanner.next();
        Map<Character, Integer> C = new HashMap<>();

        for (char c : S.toCharArray()) {
            C.put(c, C.getOrDefault(c, 0) + 1);
        }

        System.out.println(C.getOrDefault('R', 0) > n - C.getOrDefault('R', 0) ? "Yes" : "No");
    }
}
