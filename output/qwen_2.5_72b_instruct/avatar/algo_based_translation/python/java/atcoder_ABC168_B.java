
import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        System.out.println(main());
    }

    public static String main() {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String S = scanner.nextLine();
        if (S.length() <= K) {
            return S;
        }
        return S.substring(0, K) + "...";
    }
}

