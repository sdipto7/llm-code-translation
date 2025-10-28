import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            int sIndex = s.indexOf("S");
            int gIndex = s.indexOf("G");
            c.add(sIndex - gIndex);
        }
        boolean anyNegative = c.stream().anyMatch(a -> a < 0);
        System.out.println(anyNegative ? -1 : c.size());
    }
}
