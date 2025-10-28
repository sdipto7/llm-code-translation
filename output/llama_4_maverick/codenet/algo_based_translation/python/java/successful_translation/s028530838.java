
import java.util.Scanner;

public class s028530838 {
    public static void checkCase() {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        scanner.close();
        if (x.toLowerCase().equals(x)) {
            System.out.println("a");
        } else {
            System.out.println("A");
        }
    }

    public static void main(String[] args) {
        checkCase();
    }
}

