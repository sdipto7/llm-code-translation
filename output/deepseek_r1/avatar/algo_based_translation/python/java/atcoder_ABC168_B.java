
import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        
        if (s.length() <= k) {
            System.out.println(s);
        } else {
            System.out.println(s.substring(0, k) + "...");
        }
        
        scanner.close();
    }
}

