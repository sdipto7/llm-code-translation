




import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        String[] parts = l.split("\\.");
        String[] s = parts[0].split("");
        String[] p = parts[1].split("");
        int i = Integer.parseInt(p[0]);

        if (s[s.length - 1].equals("9")) {
            System.out.println("GOTO Vasilisa.");
        } else if (!s[s.length - 1].equals("9") && i < 5) {
            String result = String.join("", s);
            System.out.println(result);
        } else {
            String result = String.join("", s);
            int num = Integer.parseInt(result) + 1;
            System.out.println(num);
        }
    }
}

