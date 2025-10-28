
import java.util.Scanner;

public class s060838372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NK = sc.nextLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);
        char[] S = sc.nextLine().toCharArray();
        char c = S[K-1];
        S[K-1] = (c == 'A') ? 'a' : (c == 'B') ? 'b' : 'c';
        System.out.println(String.valueOf(S));
    }
}

