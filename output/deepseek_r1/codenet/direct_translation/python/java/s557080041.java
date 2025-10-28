
import java.util.Scanner;

public class s557080041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int sum = 0;
        for (char c : N.toCharArray()) {
            sum += c - '0';
        }
        System.out.println(sum % 9 == 0 ? "Yes" : "No");
    }
}

