import java.util.Scanner;

public class s174910557 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        int ans = 1;
        char tmp = S.charAt(0);
        for (int i = 1; i < S.length(); i++) {
            char current = S.charAt(i);
            if (current != tmp) {
                ans++;
                tmp = current;
            }
        }
        System.out.println(ans);
    }
}
