
import java.util.Scanner;

public class s676839884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        String tSub = t.length() > 0 ? t.substring(0, t.length() - 1) : "";
        if (tSub.equals(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

