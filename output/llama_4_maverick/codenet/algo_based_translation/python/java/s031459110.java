
import java.util.Scanner;

public class s031459110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); 
        String c = scanner.nextLine();

        int num_w = countChar(c, 'W');
        int num_r = N - num_w;

        String comp = repeatChar('R', num_r) + repeatChar('W', num_w);
        int ans = 0;
        for (int i = 0; i < num_r; i++) {
            if (c.charAt(i) != comp.charAt(i)) {
                ans += 1;
            }
        }

        ans = Math.min(Math.min(num_w, num_r), ans);
        System.out.println(ans);
    }

    private static int countChar(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    private static String repeatChar(char ch, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}

