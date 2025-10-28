
import java.util.Scanner;

public class s110149598 {
    public static void main(String[] args) {
        compareStrings();
    }

    public static void compareStrings() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        String a = input[0];
        String b = input[1];
        if (a.compareTo(b) < 0) {
            System.out.println("<");
        } else if (a.compareTo(b) > 0) {
            System.out.println(">");
        } else {
            System.out.println("=");
        }
        scanner.close();
    }
}

