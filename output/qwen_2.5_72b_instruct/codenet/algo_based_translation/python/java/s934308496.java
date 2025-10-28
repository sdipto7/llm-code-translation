
import java.util.Scanner;
import java.util.Arrays;

public class s934308496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }
        scanner.close();
        
        Arrays.sort(m);
        int sum = 0;
        for (int num : m) {
            sum += num;
        }
        
        int result = n + (x - sum) / m[0];
        System.out.println(result);
    }
}

