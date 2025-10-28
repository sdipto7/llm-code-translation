
import java.util.Scanner;

public class s355314304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        if (n % 1000 == 0) {
            result = 0;
        } else {
            result = 1000 - n % 1000;
        }
        System.out.println(result);
        scanner.close();
    }
}

