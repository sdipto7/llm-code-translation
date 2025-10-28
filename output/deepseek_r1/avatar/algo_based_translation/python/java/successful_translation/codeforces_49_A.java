
import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String vowels = "aeiouyAEIOUY";
        
        for (int i = a.length() - 1; i >= 0; i--) {
            char currentChar = a.charAt(i);
            if (currentChar == ' ' || currentChar == '?') {
                continue;
            }
            if (vowels.indexOf(currentChar) != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            break;
        }
    }
}

