
import java.util.Scanner;

public class s195311365 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(processString(s));
    }

    public static String processString(String s) {
        if (s.length() == 2) {
            return s;
        } else {
            return new StringBuilder(s).reverse().toString();
        }
    }
}

