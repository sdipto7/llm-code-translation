
import java.util.Scanner;

public class s423256012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        
        int sum = A + B;
        if (sum % 2 == 1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(sum / 2);
        }
    }
}

