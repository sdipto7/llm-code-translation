
import java.util.Scanner;

public class s764356857 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // Calculate and print the result
        int result = calculatePossibleValue(A, B);
        System.out.println(result);
        
        scanner.close();
    }

    public static int calculatePossibleValue(int A, int B) {
        int min = B * 10;
        int max = (B + 1) * 10 - 1;
        int ans = -1;

        for (int i = min; i <= max; i++) {
            if ((int) (i * 0.08) == A) {
                ans = i;
                break;
            }
        }
        
        return ans;
    }
}

