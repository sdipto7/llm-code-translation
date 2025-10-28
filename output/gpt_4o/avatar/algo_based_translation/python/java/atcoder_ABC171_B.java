
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC171_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 3: Input Handling
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Step 4: Declare variable
        int[] numbers = new int[n];

        // Step 5: Input Handling
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Step 6: Data Processing Logic
        Arrays.sort(numbers);

        // Step 8: Data Processing Logic
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += numbers[i];
        }

        // Step 9: Output Handling
        System.out.println(sum);

        scanner.close();
    }
}

