
import java.util.Scanner;

public class s960572618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine().trim();
        String[] parts = inputLine.split("\\s+");
        String a = parts[0];
        String b = parts[1];
        String c = parts[2];
        if (a.equals(b) && b.equals(c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

