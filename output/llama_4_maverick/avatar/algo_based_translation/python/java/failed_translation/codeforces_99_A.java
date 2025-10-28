
import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.next();
        String[] parts = l.split("\\.");
        char[] s = parts[0].toCharArray();
        int i = Character.getNumericValue(parts[1].charAt(0));
        if (s[s.length - 1] == '9') {
            System.out.println("GOTO Vasilisa.");
        } else if (s[s.length - 1] != '9' && i < 5) {
            System.out.println(parts[0]);
        } else {
            System.out.println(Integer.parseInt(parts[0]) + 1);
        }
    }
}

