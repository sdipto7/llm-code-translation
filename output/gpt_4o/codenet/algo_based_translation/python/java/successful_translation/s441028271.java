
import java.util.Scanner;

public class s441028271 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        
        int result = calculateDifference(a, b, c, k);
        System.out.println(result);
        
        scanner.close();
    }
    
    public static int calculateDifference(int a, int b, int c, int k) {
        if (k % 2 == 0) {
            return a - b;
        } else {
            return b - a;
        }
    }
}

