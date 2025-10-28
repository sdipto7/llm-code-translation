import java.util.*;

public class s007458552 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String S = sc.next();
        Map<Character, Integer> C = new HashMap<>();
        for (char c : S.toCharArray()) {
            C.put(c, C.getOrDefault(c, 0) + 1);
        }
        int countR = C.getOrDefault('R', 0);
        System.out.println(countR > n - countR ? "Yes" : "No");
    }
}
