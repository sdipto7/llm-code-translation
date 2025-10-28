
import java.util.Scanner;

public class s642705424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        String S = scanner.nextLine();
        System.out.println(countSegments(N, S));
    }

    public static int countSegments(int N, String S) {
        int x = 1;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                x++;
            }
        }
        return x;
    }
}

