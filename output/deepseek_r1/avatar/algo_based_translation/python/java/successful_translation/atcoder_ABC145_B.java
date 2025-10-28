
import java.util.Scanner;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        
        if (n % 2 != 0) {
            System.out.println("No");
        } else {
            int half = n / 2;
            String firstPart = s.substring(0, half);
            String secondPart = s.substring(half);
            System.out.println(firstPart.equals(secondPart) ? "Yes" : "No");
        }
    }
}

