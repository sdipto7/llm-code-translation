
import java.util.Scanner;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        if (n < 1) {
            if (m < 1) {
                System.out.println(n + " " + m);
                System.exit(0);
            } else {
                System.out.println("Impossible");
                System.exit(0);
            }
        }
        
        int minVal;
        int maxVal;
        
        if (m > n) {
            minVal = m;
            maxVal = n + m - 1;
        } else {
            minVal = n;
            maxVal = n + m - 1;
            if (m == 0) {
                maxVal = n;
            }
        }
        
        System.out.println(minVal + " " + maxVal);
    }
}

