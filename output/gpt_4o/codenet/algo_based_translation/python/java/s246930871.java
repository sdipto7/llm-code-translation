
import java.util.Scanner;

public class s246930871 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int result = calculateMinValue(N, A, B);
        
        System.out.println(result);
        
        scanner.close();
    }

    public static int calculateMinValue(int N, int A, int B) {
        int divisionResult = N / (A + B);
        int firstPart = A * divisionResult;
        int remainder = N % (A + B);
        int minValue = Math.min(A, remainder);
        int ans = firstPart + minValue;
        return ans;
    }
}

