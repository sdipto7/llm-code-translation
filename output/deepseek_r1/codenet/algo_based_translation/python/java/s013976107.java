
import java.util.Scanner;

public class s013976107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String S = scanner.next();
        
        int dashCount = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '-') {
                dashCount++;
            }
        }
        
        if (S.charAt(A) == '-' && dashCount == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

