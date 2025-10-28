



import java.util.HashSet;
import java.util.Scanner;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        HashSet<Integer> c = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int diff = s.indexOf('S') - s.indexOf('G');
            c.add(diff);
        }
        boolean invalid = c.stream().anyMatch(diff -> diff < 0);
        if (invalid) {
            System.out.println(-1);
        } else {
            System.out.println(c.size());
        }
    }
}

