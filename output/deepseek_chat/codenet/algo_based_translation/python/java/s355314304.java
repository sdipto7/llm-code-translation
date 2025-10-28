import java.util.Scanner;

public class s355314304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n % 1000 == 0) {
            System.out.println(0);
        } else {
            int remainder = n % 1000;
            int result = 1000 - remainder;
            System.out.println(result);
        }
    }
}
