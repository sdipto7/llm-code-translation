
import java.util.Scanner;

public class s167793578 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read two integers N and M from input
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        // Calculate combinations
        int a = N * (N - 1) / 2;
        int b = M * (M - 1) / 2;
        
        // Print the result of the sum of combinations a and b
        System.out.println(a + b);
    }
}

