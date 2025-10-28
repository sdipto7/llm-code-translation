
import java.util.Scanner;

public class s960572618 {
    public static void main(String[] args) {
        System.out.println(checkEquality());
    }

    public static String checkEquality() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] parts = input.split("\\s+");
        
        String a = parts[0];
        String b = parts[1];
        String c = parts[2];
        
        if (a.equals(b) && b.equals(c)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

