
import java.util.Scanner;

public class s018260659 {
    public static String checkDivisibility(int N) {
        int cnt = 1;
        while (cnt <= 9) {
            if (N % cnt == 0 && 1 <= (double)N / cnt && (double)N / cnt <= 9) {
                return "Yes";
            } else {
                cnt += 1;
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        System.out.println(checkDivisibility(N));
    }
}

