
import java.util.Scanner;

public class s652791025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int lastDigit = Character.getNumericValue(n.charAt(n.length() - 1));

        if (lastDigit == 2 || lastDigit == 4 || lastDigit == 5 || lastDigit == 7 || lastDigit == 9) {
            System.out.println("hon");
        } else if (lastDigit == 0 || lastDigit == 1 || lastDigit == 6 || lastDigit == 8) {
            System.out.println("pon");
        } else {
            System.out.println("bon");
        }
    }
}

