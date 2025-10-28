
import java.util.*;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] m = sc.nextLine().trim().split("\\s+");
        boolean possible = true;
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String s : m) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }
        int threshold = n / 2 + 1;
        for (int count : countMap.values()) {
            if (count >= threshold) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}

