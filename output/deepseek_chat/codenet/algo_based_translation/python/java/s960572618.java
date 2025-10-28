import java.util.Scanner;

public class s960572618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        
        if (a.equals(b) && b.equals(c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
