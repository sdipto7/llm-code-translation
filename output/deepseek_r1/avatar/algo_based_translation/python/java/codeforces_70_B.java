
import java.util.Scanner;

public class codeforces_70_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String line = scanner.nextLine();
        
        String[] sentences = line.split("[.?!]");
        int ans = 1;
        int sumL = 0;
        
        for (String part : sentences) {
            String s = part.trim() + ".";
            int L = s.length();
            
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    return;
                }
                
                int required = sumL + L + (sumL > 0 ? 1 : 0);
                if (required > n) {
                    ans++;
                    sumL = L;
                } else {
                    sumL += L + (sumL > 0 ? 1 : 0);
                }
            }
        }
        
        System.out.println(ans);
    }
}

