
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class s952264435 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            A.add(scanner.nextInt());
        }
        
        int result = calculateRemainingTasks(N, A);
        System.out.println(result);
        
        scanner.close();
    }

    public static int calculateRemainingTasks(int N, List<Integer> A) {
        int A_sum = 0;
        for (int num : A) {
            A_sum += num;
        }
        
        if (N - A_sum >= 0) {
            return N - A_sum;
        } else {
            return -1;
        }
    }
}

