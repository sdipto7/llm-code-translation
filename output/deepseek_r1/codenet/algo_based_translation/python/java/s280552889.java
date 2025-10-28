
import java.util.Scanner;

public class s280552889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result;
        
        if (N % 2 == 0) {
            result = N / 2;
        } else {
            result = (N / 2) + 1;
        }
        
        System.out.println(result);
        scanner.close();
    }
}

