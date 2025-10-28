
import java.util.Scanner;

public class codeforces_110_B {
    public static void main(String[] args) {
        final String LUCKY = "abcd";
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder s = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            int index = i % 4;
            s.append(LUCKY.charAt(index));
        }
        
        System.out.println(s.toString());
    }
}

