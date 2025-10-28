
import java.util.*;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Set<Integer> diffs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int sPos = s.indexOf('S');
            int gPos = s.indexOf('G');
            diffs.add(sPos - gPos);
        }
        boolean hasNegative = false;
        for (int d : diffs) {
            if (d < 0) {
                hasNegative = true;
                break;
            }
        }
        System.out.println(hasNegative ? -1 : diffs.size());
    }
}

