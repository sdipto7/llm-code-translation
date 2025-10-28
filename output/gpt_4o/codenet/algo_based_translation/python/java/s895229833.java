
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s895229833 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        List<Integer> heights = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            heights.add(scanner.nextInt());
        }
        
        int result = findLongestNonIncreasingSubsequence(N, heights);
        System.out.println(result);
        
        scanner.close();
    }
    
    public static int findLongestNonIncreasingSubsequence(int N, List<Integer> heights) {
        int count_best = 0;
        int count_tmp = 0;
        
        for (int i = 0; i < N - 1; i++) {
            if (heights.get(i) >= heights.get(i + 1)) {
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
        
        return count_best;
    }
}

