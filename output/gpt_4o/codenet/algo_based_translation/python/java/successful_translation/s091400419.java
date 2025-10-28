
import java.util.Scanner;

public class s091400419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input Operations
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // Data Processing Logic
        int[] lst = new int[3];
        lst[0] = a + b;
        lst[1] = a - b;
        lst[2] = a * b;
        
        // Output Operations
        int max = findMaximumExpressionResult(lst);
        System.out.println(max);
        
        scanner.close();
    }
    
    // Function to find the maximum value from the list
    public static int findMaximumExpressionResult(int[] lst) {
        int max = lst[0];
        for (int i = 1; i < lst.length; i++) {
            if (lst[i] > max) {
                max = lst[i];
            }
        }
        return max;
    }
}

