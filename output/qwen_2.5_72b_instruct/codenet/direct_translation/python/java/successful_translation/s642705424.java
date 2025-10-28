import java.util.Scanner;

public class s642705424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        int x = 1;
        for (int i = 0; i < N - 1; i++) {
            if (!S.substring(i, i + 1).equals(S.substring(i + 1, i + 2))) {
                x = x + 1;
            }
        }
        System.out.println(x);
    }
}
