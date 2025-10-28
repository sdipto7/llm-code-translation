import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] l = input.split("\\.");
        char[] s = l[0].toCharArray();
        char[] p = l[1].toCharArray();
        int i = Character.getNumericValue(p[0]);
        
        if (s[s.length - 1] == '9') {
            System.out.println("GOTO Vasilisa.");
        } else if (s[s.length - 1] != '9' && i < 5) {
            System.out.println(String.valueOf(s));
        } else {
            String sStr = String.valueOf(s);
            int num = Integer.parseInt(sStr);
            num++;
            System.out.println(String.valueOf(num));
        }
    }
}
