
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s170274782 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<int[]> A = new ArrayList<>();
        
        for (int i = 0; i < 2; i++) {
            int[] s = new int[N];
            for (int j = 0; j < N; j++) {
                s[j] = scanner.nextInt();
            }
            A.add(s);
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            int[] baselis = A.get(0);
            int[] groundlis = A.get(1);
            int count = 0;
            for (int j = 0; j <= i; j++) {
                count += baselis[j];
            }
            for (int j = i; j < N; j++) {
                count += groundlis[j];
            }
            ans.add(count);
        }
        
        int max = 0;
        for (int a : ans) {
            if (a > max) {
                max = a;
            }
        }
        
        System.out.println(max);
    }
}

