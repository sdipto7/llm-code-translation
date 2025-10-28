
import java.util.Scanner;

public class atcoder_ABC143_A {
    
    public static int calculateDifference(int A, int B) {
        int ans = A - 2 * B;
        if (ans < 0) {
            ans = 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        
        int result = calculateDifference(A, B);
        System.out.println(result);
    }
}

