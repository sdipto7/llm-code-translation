
import java.util.Scanner;

public class s419623944 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int R = scanner.nextInt();
        
        System.out.println(processValues(N, R));
    }

    public static int processValues(int N, int R) {
        if (N >= 10) {
            return R;
        } else {
            return R + 100 * (10 - N);
        }
    }
}

