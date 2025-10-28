import java.util.Scanner;

public class s013976107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String s = scanner.next();
        char[] S = s.toCharArray();
        if (S[A] == '-' && s.chars().filter(ch -> ch == '-').count() == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
