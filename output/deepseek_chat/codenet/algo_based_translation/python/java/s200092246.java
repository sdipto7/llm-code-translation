
import java.util.Scanner;
import java.util.ArrayList;

public class s200092246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
            if (sum < N) {
                continue;
            } else {
                ans.add(i - 1);
                ans.add(sum - N);
                break;
            }
        }
        
        for (int j = 0; j <= ans.get(0); j++) {
            if (j + 1 != ans.get(1)) {
                System.out.println(j + 1);
            }
        }
    }
}

