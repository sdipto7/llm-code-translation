
import java.util.Scanner;

public class s960572618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().trim().split(" ");
        String a = parts[0], b = parts[1], c = parts[2];
        System.out.println(a.equals(b) && b.equals(c) ? "Yes" : "No");
    }
}

