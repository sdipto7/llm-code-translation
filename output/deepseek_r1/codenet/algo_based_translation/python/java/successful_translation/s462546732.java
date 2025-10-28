
import java.util.Scanner;

public class s462546732 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] parts = inputLine.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        if (a <= b) {
            System.out.println(a);
        } else {
            System.out.println(a - 1);
        }
    }
}

