
import java.util.Scanner;

public class s060838372 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        char[] chars = S.toCharArray();
        if (chars[K - 1] == 'A') {
            chars[K - 1] = 'a';
        } else if (chars[K - 1] == 'B') {
            chars[K - 1] = 'b';
        } else {
            chars[K - 1] = 'c';
        }
        System.out.println(new String(chars));
    }
}

