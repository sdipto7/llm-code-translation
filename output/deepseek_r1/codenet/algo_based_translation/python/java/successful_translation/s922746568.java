
import java.util.Scanner;

public class s922746568 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        
        int rCnt = 0, gCnt = 0, bCnt = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') rCnt++;
            else if (c == 'G') gCnt++;
            else if (c == 'B') bCnt++;
        }
        
        int ans = rCnt * gCnt * bCnt;
        
        for (int i = 0; i < n; i++) {
            for (int d = 0; ; d++) {
                int j = i + d;
                int k = j + d;
                if (k >= n) break;
                if (s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(k) && s.charAt(k) != s.charAt(i)) {
                    ans--;
                }
            }
        }
        
        System.out.println(ans);
    }
}

