
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        List<Character> vo = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y');
        
        for (int i = a.length() - 1; i >= 0; i--) {
            char currentChar = a.charAt(i);
            if (currentChar == ' ' || currentChar == '?') {
                continue;
            } else {
                if (vo.contains(currentChar)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                break;
            }
        }
    }
}

