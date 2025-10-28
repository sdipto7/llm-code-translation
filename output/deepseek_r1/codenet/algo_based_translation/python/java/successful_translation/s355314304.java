
import java.util.Scanner;

public class s355314304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int remainder = n % 1000;
        if (remainder == 0) {
            System.out.println(0);
        } else {
            System.out.println(1000 - remainder);
        }
        scanner.close();
    }
}

