
import java.util.Scanner;

public class s200092246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        int sum = 0;
        while (true) {
            sum += i;
            if (sum >= N) {
                break;
            }
            i++;
        }
        int exclude = sum - N;
        for (int j = 1; j <= i; j++) {
            if (j != exclude) {
                System.out.println(j);
            }
        }
    }
}

