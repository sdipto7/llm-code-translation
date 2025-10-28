
import java.util.Scanner;
import java.util.HashMap;

public class s007458552 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String S = sc.next();
        HashMap<Character, Integer> C = new HashMap<>();
        for (char c : S.toCharArray()) {
            C.put(c, C.getOrDefault(c, 0) + 1);
        }
        System.out.println(C.getOrDefault('R', 0) > n - C.getOrDefault('R', 0) ? "Yes" : "No");
    }
}

