
import java.util.*;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] m = sc.nextLine().trim().split(" ");
        sc.close();

        boolean possible = true;
        Set<String> unique = new HashSet<>(Arrays.asList(m));
        for (String i : unique) {
            int count = 0;
            for (String s : m) {
                if (s.equals(i)) count++;
            }
            if (count >= (n / 2) + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}

