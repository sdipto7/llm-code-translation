
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String sInput = scanner.next();
        String tInput = scanner.next();
        
        List<String> s = new ArrayList<>();
        List<String> t = new ArrayList<>();
        
        for (char c : sInput.toCharArray()) {
            s.add(String.valueOf(c));
        }
        
        for (char c : tInput.toCharArray()) {
            t.add(String.valueOf(c));
        }
        
        if (s.equals(t)) {
            System.out.println(n);
        } else {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    if (!s.get(i + j).equals(t.get(j))) {
                        break;
                    }
                    if (j == n - i - 1) {
                        cnt = n - i;
                    }
                }
            }
            System.out.println(2 * n - cnt);
        }
        
        scanner.close();
    }
}

