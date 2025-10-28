
import java.util.*;
import java.util.stream.*;
import java.nio.IntBuffer;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] firstLine = scanner.nextLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        
        String[] secondLine = scanner.nextLine().split(" ");
        long[] A = Arrays.stream(secondLine).mapToLong(Long::parseLong).toArray();
        
        long[] extendedArray = new long[A.length + 1];
        extendedArray[0] = 0;
        System.arraycopy(A, 0, extendedArray, 1, A.length);
        
        long[] remainders = new long[extendedArray.length];
        for (int i = 0; i < extendedArray.length; i++) {
            remainders[i] = extendedArray[i] % M;
        }
        
        long[] cumRemainders = new long[remainders.length];
        long sum = 0;
        for (int i = 0; i < remainders.length; i++) {
            sum = (sum + remainders[i]) % M;
            cumRemainders[i] = sum;
        }
        
        Map<Long, Integer> remainderCounts = new HashMap<>();
        for (long rem : cumRemainders) {
            remainderCounts.put(rem, remainderCounts.getOrDefault(rem, 0) + 1);
        }
        
        long combinations = 0;
        for (int count : remainderCounts.values()) {
            combinations += (long) count * (count - 1) / 2;
        }
        
        System.out.println(combinations);
    }
}

