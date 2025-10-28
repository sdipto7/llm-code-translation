
import java.util.Scanner;

public class s486032847 {

    public static int keta(String s) {
        if (s.length() < 2) {
            return Integer.parseInt(s);
        }
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }
        return keta(Integer.toString(sum));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        
        if (keta(N) % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}

