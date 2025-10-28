
import java.util.Scanner;

public class codeforces_49_A {

    public static void main(String[] args) {
        checkLastCharacter();
    }

    public static void checkLastCharacter() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] vo = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};

        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == ' ' || a.charAt(i) == '?') {
                continue;
            } else {
                boolean isVowel = false;
                for (char vowel : vo) {
                    if (a.charAt(i) == vowel) {
                        isVowel = true;
                        break;
                    }
                }
                if (isVowel) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                break;
            }
        }
        scanner.close();
    }
}

