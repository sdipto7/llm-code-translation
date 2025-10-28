
import java.util.Scanner;

public class s142939923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int[] x = new int[3];
        x[0] = a + b;
        x[1] = a - b;
        x[2] = a * b;
        
        int max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        
        System.out.println(max);
    }
}

