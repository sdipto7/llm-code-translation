
import java.util.Scanner;

public class s280552889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(calculate_output(N));
    }

    public static int calculate_output(int N) {
        if (N % 2 == 0) {
            return N / 2;
        } else {
            return N / 2 + 1;
        }
    }
}

