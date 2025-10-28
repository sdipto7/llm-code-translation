
import java.util.Scanner;

public class s557080041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        if (N.equals("0")) {
            System.out.println("Yes");
        } else {
            int X = 0;
            for (char c : N.toCharArray()) {
                X += Character.getNumericValue(c);
            }
            if (X % 9 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scanner.close();
    }
}

