
import java.util.Scanner;

public class s398580870 {

    public static int calculateValue(int n, int k) {
        int result;
        if (k % 2 == 1) {
            result = (int) Math.pow(n / k, 3);
        } else {
            result = (int) Math.pow(n / k, 3) + (int) Math.pow((n + k / 2) / k, 3);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        
        int result = calculateValue(n, k);
        System.out.println(result);
    }
}

