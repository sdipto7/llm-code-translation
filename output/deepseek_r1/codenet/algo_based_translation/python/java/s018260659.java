
import java.util.Scanner;

public class s018260659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int cnt = 1;
        boolean found = false;
        
        while (cnt <= 9) {
            if (N % cnt == 0 && (N / cnt) >= 1 && (N / cnt) <= 9) {
                System.out.println("Yes");
                found = true;
                break;
            } else {
                cnt++;
            }
        }
        
        if (!found) {
            System.out.println("No");
        }
    }
}

