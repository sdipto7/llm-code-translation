
import java.util.Scanner;

public class s522872163 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input and Data Processing
        int X = scanner.nextInt();
        int A = scanner.nextInt();
        
        // Conditional Logic
        int result;
        if (X < A) {
            result = 0;
        } else {
            result = 10;
        }
        
        // Output
        System.out.println(result);
        
        scanner.close();
    }
}

