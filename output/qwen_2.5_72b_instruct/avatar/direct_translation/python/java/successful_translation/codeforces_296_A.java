import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] m = scanner.nextLine().split(" ");
        boolean possible = true;
        Map<String, Integer> countMap = new HashMap<>();
        for (String i : m) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() >= n / 2.0 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
