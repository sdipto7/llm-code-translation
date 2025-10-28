
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class codeforces_400_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Operations
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        // Logic Flow
        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            int indexS = s.indexOf('S');
            int indexG = s.indexOf('G');
            c.add(indexS - indexG);
        }

        // Output Operations
        boolean hasNegative = c.stream().anyMatch(a -> a < 0);
        if (hasNegative) {
            System.out.println(-1);
        } else {
            System.out.println(c.size());
        }

        scanner.close();
    }
}

