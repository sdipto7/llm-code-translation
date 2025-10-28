import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class s182651529 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> score = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            score.add(scanner.nextInt());
        }
        int mae = 0;
        int usiro = K;
        for (int i = 0; i < N - K; i++) {
            if (score.get(mae) < score.get(usiro)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            mae++;
            usiro++;
        }
        scanner.close();
    }
}
