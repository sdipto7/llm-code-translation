
import java.util.Scanner;

public class s060838372 {

    public static String transformString(int N, int K, String S) {
        char[] chars = S.toCharArray();
        if (chars[K - 1] == 'A') {
            chars[K - 1] = 'a';
        } else if (chars[K - 1] == 'B') {
            chars[K - 1] = 'b';
        } else {
            chars[K - 1] = 'c';
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        String S = scanner.nextLine();
        String result = transformString(N, K, S);
        System.out.println(result);
        scanner.close();
    }
}

