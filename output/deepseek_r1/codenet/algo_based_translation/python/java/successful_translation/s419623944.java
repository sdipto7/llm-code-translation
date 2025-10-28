
import java.util.Scanner;

public class s419623944 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int R = scanner.nextInt();
        
        if (N >= 10) {
            System.out.println(R);
        } else {
            int diff = 10 - N;
            int result = R + 100 * diff;
            System.out.println(result);
        }
    }
}

