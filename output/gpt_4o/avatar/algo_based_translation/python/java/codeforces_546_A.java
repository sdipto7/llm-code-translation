
import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        calculateBorrowAmount();
    }
    
    public static void calculateBorrowAmount() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        
        int k = Integer.parseInt(inputs[0]);
        int n = Integer.parseInt(inputs[1]);
        int w = Integer.parseInt(inputs[2]);
        
        if (1 <= k && w <= 1000) {
            int total = 0;
            for (int i = 1; i <= w; i++) {
                total += i * k;
            }
            if (total > n) {
                System.out.println(total - n);
            } else {
                System.out.println(0);
            }
        }
        
        scanner.close();
    }
}

