
import java.util.Scanner;

public class s404600540 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int h = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        
        int min1 = Math.min(Math.min(Math.min(q * 4, h * 2), q * 2 + h), s);
        int min2 = Math.min(min1 * 2, d);
        
        int totalCost = (n % 2) * min1 + (n / 2) * min2;
        System.out.println(totalCost);
    }
}

