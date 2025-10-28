
import java.util.*;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            int indexS = s.indexOf("S");
            int indexG = s.indexOf("G");
            if (indexS != -1 && indexG != -1) {
                c.add(indexS - indexG);
            }
        }
        if (c.stream().anyMatch(a -> a < 0)) {
            System.out.println(-1);
        } else {
            System.out.println(c.size());
        }
    }
}

