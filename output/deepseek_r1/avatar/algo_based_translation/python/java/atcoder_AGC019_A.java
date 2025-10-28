
import java.util.Scanner;

public class atcoder_AGC019_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int h = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        
        int best1L = Math.min(Math.min(4 * q, 2 * h), s);
        int best2L = Math.min(d, 2 * best1L);
        
        int pairs = n / 2;
        int totalCost = n % 2 == 0 
            ? pairs * best2L 
            : pairs * best2L + best1L;
        
        System.out.println(totalCost);
    }
}

