
import java.util.*;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        List<String> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String k = scanner.nextLine();
            s.add(k);
        }
        
        int flag = 0;
        List<Character> d1 = new ArrayList<>();
        List<Character> d2 = new ArrayList<>();
        Set<Character> rem = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    d1.add(s.get(i).charAt(j));
                }
                if (i == n - j - 1) {
                    d2.add(s.get(i).charAt(j));
                }
                if (i != j && i != n - j - 1) {
                    rem.add(s.get(i).charAt(j));
                }
            }
        }
        
        if (rem.size() != 1) {
            System.out.println("NO");
        } else if (!d1.equals(d2)) {
            System.out.println("NO");
        } else {
            Set<Character> d1Set = new HashSet<>(d1);
            if (d1Set.size() != 1) {
                System.out.println("NO");
            } else if (d1Set.equals(rem)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}

