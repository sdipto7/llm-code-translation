
import java.util.Scanner;

public class atcoder_ABC106_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        int k = scanner.nextInt();
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c != '1') break;
            l++;
        }
        System.out.println(l >= k ? '1' : s.charAt(l));
    }
}

