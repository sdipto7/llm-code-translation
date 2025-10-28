import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class s170274782 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> A = new ArrayList<>();
        
        for (int j = 0; j < 2; j++) {
            List<Integer> s = new ArrayList<>();
            for (int k = 0; k < N; k++) {
                s.add(scanner.nextInt());
            }
            A.add(s);
        }

        List<Integer> ans = new ArrayList<>();
        int count;

        for (int i = 0; i < N; i++) {
            List<Integer> baselis = A.get(0);
            List<Integer> groundlis = A.get(1);
            count = 0;
            for (int x = 0; x <= i; x++) {
                count += baselis.get(x);
            }
            for (int y = i; y < N; y++) {
                count += groundlis.get(y);
            }
            ans.add(count);
        }

        int max = Integer.MIN_VALUE;
        for (int value : ans) {
            if (value > max) {
                max = value;
            }
        }

        System.out.println(max);
        scanner.close();
    }
}
