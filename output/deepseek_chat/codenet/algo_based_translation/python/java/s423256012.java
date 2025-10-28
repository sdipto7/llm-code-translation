
import java.util.Scanner;

public class s423256012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] parts = inputString.split(" ");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int sum = A + B;
        if (sum % 2 == 1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(sum / 2);
        }
    }
}

