
import java.util.Scanner;

public class s195311365 {
    public static void main(String[] args) {
        processString();
    }

    public static void processString() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        if (s.length() == 2) {
            System.out.println(s);
        } else {
            StringBuilder reversed = new StringBuilder(s).reverse();
            System.out.println(reversed.toString());
        }
    }
}

