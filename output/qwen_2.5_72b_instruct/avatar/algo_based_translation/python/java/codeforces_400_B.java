
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        Set<Integer> c = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            int sIndex = s.indexOf("S");
            int gIndex = s.indexOf("G");
            int difference = sIndex - gIndex;
            c.add(difference);
        }
        
        boolean hasNegative = false;
        for (int a : c) {
            if (a < 0) {
                hasNegative = true;
                break;
            }
        }
        
        if (hasNegative) {
            System.out.println(-1);
        } else {
            System.out.println(c.size());
        }
        
        scanner.close();
    }
}

