
import java.util.Scanner;

public class s060838372 {
    public static String transformString(int N, int K, String S) {
        char[] charArray = S.toCharArray();
        if (charArray[K - 1] == 'A') {
            charArray[K - 1] = 'a';
        } else if (charArray[K - 1] == 'B') {
            charArray[K - 1] = 'b';
        } else {
            charArray[K - 1] = 'c';
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();
        String ans = transformString(N, K, S);
        System.out.println(ans);
    }
}

