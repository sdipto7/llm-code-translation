
import java.util.Scanner;

public class s174910557 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        
        int ans = 1;
        char tmp = S.charAt(0);
        
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            if (s != tmp) {
                ans++;
                tmp = s;
            }
        }
        
        System.out.println(ans);
    }
}

