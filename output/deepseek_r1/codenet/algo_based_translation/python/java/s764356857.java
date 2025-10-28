
import java.util.Scanner;

public class s764356857 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int minVal = B * 10;
        int maxVal = (B + 1) * 10 - 1;
        int ans = -1;
        
        for (int i = minVal; i <= maxVal; i++) {
            if ((int)(i * 0.08) == A) {
                ans = i;
                break;
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}

