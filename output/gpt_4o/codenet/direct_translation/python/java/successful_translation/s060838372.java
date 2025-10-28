
import java.util.Scanner;

public class s060838372 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        char[] S = scanner.nextLine().toCharArray();
        
        if (S[K - 1] == 'A') {
            S[K - 1] = 'a';
        } else if (S[K - 1] == 'B') {
            S[K - 1] = 'b';
        } else {
            S[K - 1] = 'c';
        }
        
        String ans = new String(S);
        System.out.println(ans);
    }
}

