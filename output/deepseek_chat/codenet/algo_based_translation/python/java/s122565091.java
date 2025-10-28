
import java.util.Scanner;

public class s122565091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int v = scanner.nextInt();
        int b = scanner.nextInt();
        int w = scanner.nextInt();
        int t = scanner.nextInt();
        
        if (a == b) {
            System.out.println("YES");
        } else if (v <= w) {
            System.out.println("NO");
        } else {
            double timeNeeded = Math.abs(a - b) / (double)(v - w);
            if (t < timeNeeded) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        
        scanner.close();
    }
}

