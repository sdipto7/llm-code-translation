
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String v = scanner.nextLine();
        
        String[] d = {"LEFT", "RIGHT"};
        boolean f = (k - 1) < (n - k);
        int m = Math.min(k - 1, n - k);
        ArrayList<String> a = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            a.add(d[f ? 0 : 1]);
        }
        
        int direction = -1 + 2 * (f ? 1 : 0);
        String str = v;
        if (direction == -1) {
            StringBuilder reversed = new StringBuilder(v);
            str = reversed.reverse().toString();
        }
        
        for (int i = 0; i < str.length(); i++) {
            a.add("PRINT " + str.charAt(i));
            a.add(d[f ? 1 : 0]);
        }
        
        for (int i = 0; i < a.size() - 1; i++) {
            System.out.println(a.get(i));
        }
    }
}

