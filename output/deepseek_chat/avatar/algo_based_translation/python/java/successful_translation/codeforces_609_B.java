
import java.util.*;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        
        Map<Integer, Integer> l = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = lst[i];
            l.put(num, l.getOrDefault(num, 0) + 1);
        }
        
        int res = 0;
        for (int i = 0; i < n; i++) {
            int num = lst[i];
            int count = l.get(num);
            if (count > 1) {
                res += n - i - count;
                l.put(num, count - 1);
            } else {
                res += n - i - 1;
            }
        }
        
        System.out.println(res);
        scanner.close();
    }
}

