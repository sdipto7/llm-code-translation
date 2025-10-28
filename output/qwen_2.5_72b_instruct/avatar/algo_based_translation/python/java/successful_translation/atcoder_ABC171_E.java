import java.util.*;
import java.util.stream.*;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> a = Stream.iterate(0, i -> scanner.hasNextInt(), i -> i + 1)
                                 .map(i -> scanner.nextInt())
                                 .limit(N)
                                 .collect(Collectors.toList());
        int total = a.stream().reduce(0, (x, y) -> x ^ y);
        String result = a.stream().map(ai -> String.valueOf(ai ^ total))
                          .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
