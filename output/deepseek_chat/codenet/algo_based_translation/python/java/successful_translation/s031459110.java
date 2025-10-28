
import java.util.Scanner;

public class s031459110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String c = scanner.next();
        
        int num_w = (int) c.chars().filter(ch -> ch == 'W').count();
        int num_r = N - num_w;
        
        StringBuilder compBuilder = new StringBuilder();
        for (int i = 0; i < num_r; i++) {
            compBuilder.append('R');
        }
        for (int i = 0; i < num_w; i++) {
            compBuilder.append('W');
        }
        String comp = compBuilder.toString();
        
        int ans = 0;
        for (int i = 0; i < num_r; i++) {
            if (c.charAt(i) != comp.charAt(i)) {
                ans++;
            }
        }
        
        ans = Math.min(Math.min(num_w, num_r), ans);
        System.out.println(ans);
    }
}

