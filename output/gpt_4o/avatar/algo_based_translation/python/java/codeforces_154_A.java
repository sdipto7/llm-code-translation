
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_154_A {

    public static int calculateScore(String s, int n, List<String> sequences) {
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            String x = sequences.get(i);
            int a = 0, b = 0;
            
            for (char j : s.toCharArray()) {
                if (j == x.charAt(0)) {
                    a++;
                } else if (j == x.charAt(1)) {
                    b++;
                } else {
                    ans += Math.min(a, b);
                    a = 0;
                    b = 0;
                }
            }
            ans += Math.min(a, b);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        List<String> sequences = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            sequences.add(scanner.nextLine());
        }
        
        int result = calculateScore(s, n, sequences);
        System.out.println(result);
    }
}

