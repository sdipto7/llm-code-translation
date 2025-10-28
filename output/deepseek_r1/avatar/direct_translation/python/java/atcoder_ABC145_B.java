
import java.util.Scanner;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        if (n % 2 != 0) {
            System.out.println("No");
        } else {
            int half = n / 2;
            if (s.substring(0, half).equals(s.substring(half))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

