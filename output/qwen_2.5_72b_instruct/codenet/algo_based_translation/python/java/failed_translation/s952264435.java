import java.util.Scanner;

public class s952264435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int A_sum = 0;
        
        for (int i = 0; i < N; i++) {
            A_sum += scanner.nextInt();
        }
        
        if (N - A_sum >= 0) {
            System.out.println(N - A_sum);
        } else {
            System.out.println("-1");
        }
        
        scanner.close();
    }
}
