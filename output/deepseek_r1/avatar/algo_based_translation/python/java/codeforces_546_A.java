
import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputParts = scanner.nextLine().split("\\s+");
        int k = Integer.parseInt(inputParts[0]);
        int n = Integer.parseInt(inputParts[1]);
        int w = Integer.parseInt(inputParts[2]);
        
        if (k >= 1 && w <= 1000) {
            int total = 0;
            for (int i = 1; i <= w; i++) {
                total += i * k;
            }
            System.out.println(total > n ? total - n : 0);
        }
    }
}

