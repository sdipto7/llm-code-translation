
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class s557080041 {
    public static void main(String[] args) {
        checkSumOfDigitsDivisibleBy9();
    }

    public static void checkSumOfDigitsDivisibleBy9() {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        if (N.equals("0")) {
            System.out.println("Yes");
        } else {
            List<Integer> L = new ArrayList<>();
            for (char c : N.toCharArray()) {
                L.add(Character.getNumericValue(c));
            }
            int X = 0;
            for (int num : L) {
                X += num;
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

