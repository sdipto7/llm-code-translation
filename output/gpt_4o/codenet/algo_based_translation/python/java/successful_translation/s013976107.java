
import java.util.Scanner;

public class s013976107 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline
        String S = scanner.nextLine();
        
        String result = checkHyphenFormat(A, B, S);
        System.out.println(result);
        
        scanner.close();
    }

    public static String checkHyphenFormat(int A, int B, String S) {
        if (S.charAt(A) == '-' && S.chars().filter(ch -> ch == '-').count() == 1) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

