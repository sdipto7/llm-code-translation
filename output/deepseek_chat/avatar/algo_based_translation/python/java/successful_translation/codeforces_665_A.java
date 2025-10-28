
import java.util.Scanner;

public class codeforces_665_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int at = scanner.nextInt();
        int b = scanner.nextInt();
        int bt = scanner.nextInt();
        String[] timeParts = scanner.next().split(":");
        int t1 = Integer.parseInt(timeParts[0]);
        int t2 = Integer.parseInt(timeParts[1]);
        
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        int now = 0;
        int ans = 0;
        
        while (now < fin && now < 1140) {
            if (now + bt > st) {
                ans++;
            }
            now += b;
        }
        
        System.out.println(ans);
    }
}

