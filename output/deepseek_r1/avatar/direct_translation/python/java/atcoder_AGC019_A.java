
import java.util.Scanner;

public class atcoder_AGC019_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        
        int best1L = Math.min(q * 4, Math.min(h * 2, s));
        int best2L = Math.min(d, best1L * 2);
        
        long total;
        if (n % 2 == 0) {
            total = (long) best2L * (n / 2);
        } else {
            total = (long) best2L * (n / 2) + best1L;
        }
        
        System.out.println(total);
    }
}

