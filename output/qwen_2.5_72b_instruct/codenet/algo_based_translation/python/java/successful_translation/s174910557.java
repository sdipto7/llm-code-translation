
import java.util.Scanner;

public class s174910557 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        
        int ans = 1;
        char tmp = S.charAt(0);
        
        for (char s : S.toCharArray()) {
            if (s != tmp) {
                ans++;
                tmp = s;
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}

