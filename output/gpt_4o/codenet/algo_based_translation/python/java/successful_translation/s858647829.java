
import java.util.Scanner;

public class s858647829 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        String result = check_divisibility(a, b);
        System.out.println(result);
    }

    public static String check_divisibility(int a, int b) {
        if (a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) {
            return "Possible";
        } else {
            return "Impossible";
        }
    }
}

