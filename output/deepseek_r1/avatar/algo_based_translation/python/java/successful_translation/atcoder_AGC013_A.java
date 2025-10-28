
import java.util.*;

public class atcoder_AGC013_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }

        List<Integer> compressedA = new ArrayList<>();
        if (!A.isEmpty()) {
            int prev = A.get(0);
            compressedA.add(prev);
            for (int num : A) {
                if (num != prev) {
                    compressedA.add(num);
                    prev = num;
                }
            }
        }
        int compressedN = compressedA.size();
        
        if (compressedN < 3) {
            System.out.println(1);
            return;
        }

        int ans = 0;
        int i = 1;
        while (i < compressedN - 1) {
            int before = compressedA.get(i - 1);
            int current = compressedA.get(i);
            int after = compressedA.get(i + 1);
            
            if ((before < current && current > after) || (before > current && current < after)) {
                ans++;
                i++;
            }
            i++;
        }
        System.out.println(ans + 1);
    }
}

