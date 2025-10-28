
import java.util.Scanner;

public class s462546732 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] values = inputString.split(" ");
        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[1]);
        if (a <= b) {
            System.out.println(a);
        } else {
            System.out.println(a - 1);
        }
        scanner.close();
    }
}

