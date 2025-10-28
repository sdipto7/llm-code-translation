
import java.util.Scanner;

public class s013976107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ab = sc.nextLine().split(" ");
        int A = Integer.parseInt(ab[0]);
        int B = Integer.parseInt(ab[1]);
        String S = sc.nextLine();

        int count = 0;
        for (char c : S.toCharArray()) {
            if (c == '-') {
                count++;
            }
        }

        if (S.length() > A && S.charAt(A) == '-' && count == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

