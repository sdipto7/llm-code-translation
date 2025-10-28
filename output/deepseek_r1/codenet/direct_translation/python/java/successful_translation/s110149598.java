
import java.util.Scanner;

public class s110149598 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int result = a.compareTo(b);
        System.out.println(result < 0 ? "<" : result > 0 ? ">" : "=");
    }
}

