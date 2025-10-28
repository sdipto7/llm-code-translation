
import java.util.Scanner;

public class s018260659 {

    public static String checkProduct(int N) {
        int cnt = 1;
        while (cnt <= 9) {
            if (N % cnt == 0 && 1 <= N / cnt && N / cnt <= 9) {
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
        System.out.println(checkProduct(N));
    }
}

