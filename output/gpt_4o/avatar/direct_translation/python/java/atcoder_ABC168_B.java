
import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = Integer.parseInt(scanner.nextLine());
        String S = scanner.nextLine();
        System.out.println(truncateString(K, S));
    }

    private static String truncateString(int K, String S) {
        if (S.length() <= K) {
            return S;
        }
        return S.substring(0, K) + "...";
    }
}

