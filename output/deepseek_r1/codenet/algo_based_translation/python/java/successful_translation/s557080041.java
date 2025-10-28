
import java.util.Scanner;

public class s557080041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        try {
            if (Integer.parseInt(N) == 0) {
                System.out.println("Yes");
                return;
            }
        } catch (NumberFormatException e) {}
        
        char[] digits = N.toCharArray();
        int sum = 0;
        for (char c : digits) {
            sum += Character.getNumericValue(c);
        }
        System.out.println(sum % 9 == 0 ? "Yes" : "No");
    }
}

