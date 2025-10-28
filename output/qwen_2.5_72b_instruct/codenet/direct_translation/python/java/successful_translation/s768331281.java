import java.util.*;
public class s768331281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.next().trim();
        }
        Arrays.sort(S);
        for (String str : S) {
            System.out.print(str);
        }
    }
}
