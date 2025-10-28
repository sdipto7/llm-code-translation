import java.util.Scanner;

public class s486032847 {
    public static int keta(String s) {
        if (s.length() < 2) {
            return Integer.parseInt(s);
        }
        int n = s.chars().map(Character::getNumericValue).sum();
        return keta(Integer.toString(n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        if (keta(N) % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
