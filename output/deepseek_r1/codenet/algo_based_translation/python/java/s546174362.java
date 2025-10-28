
import java.util.Arrays;
import java.util.Scanner;

public class s546174362 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Integer[] A = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        
        while (M > 0) {
            A[A.length - 1] /= 2;
            M--;
            int i = A.length - 2;
            
            while (M > 0 && i >= 0 && A[i] >= A[A.length - 1]) {
                A[i] /= 2;
                M--;
                i--;
            }
            Arrays.sort(A);
        }
        
        int sum = 0;
        for (int num : A) {
            sum += num;
        }
        System.out.println(sum);
    }
}

