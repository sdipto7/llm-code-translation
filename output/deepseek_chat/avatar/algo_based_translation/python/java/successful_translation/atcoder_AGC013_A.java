
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class atcoder_AGC013_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = Integer.parseInt(scanner.nextLine().trim());
        int[] A = Arrays.stream(scanner.nextLine().trim().split(" "))
                       .mapToInt(Integer::parseInt)
                       .toArray();
        
        List<Integer> compressed = new ArrayList<>();
        int prev = -1;
        for (int num : A) {
            if (num != prev) {
                compressed.add(num);
                prev = num;
            }
        }
        
        N = compressed.size();
        int[] compressedArr = compressed.stream().mapToInt(Integer::intValue).toArray();
        
        int i = 1;
        int ans = 0;
        
        while (i < N - 1) {
            if ((compressedArr[i-1] < compressedArr[i] && compressedArr[i] > compressedArr[i+1]) || 
                (compressedArr[i-1] > compressedArr[i] && compressedArr[i] < compressedArr[i+1])) {
                ans++;
                i++;
            }
            i++;
        }
        
        System.out.println(ans + 1);
    }
}

