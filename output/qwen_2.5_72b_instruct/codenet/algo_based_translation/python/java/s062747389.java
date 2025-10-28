
import java.util.Scanner;

public class s062747389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        int result;
        if (a == b) {
            result = a + b;
        } else {
            result = Math.max(a, b) * 2 - 1;
        }
        
        System.out.println(result);
    }
}

