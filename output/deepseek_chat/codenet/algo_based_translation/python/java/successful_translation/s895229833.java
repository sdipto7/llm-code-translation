
import java.util.Scanner;
import java.util.Arrays;

public class s895229833 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] H = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int count_best = 0;
        int count_tmp = 0;
        
        for (int i = 0; i < N - 1; i++) {
            if (H[i] >= H[i + 1]) {
                count_tmp++;
            } else {
                if (count_tmp > count_best) {
                    count_best = count_tmp;
                }
                count_tmp = 0;
            }
        }
        
        if (count_tmp > count_best) {
            count_best = count_tmp;
        }
        
        System.out.println(count_best);
    }
}

