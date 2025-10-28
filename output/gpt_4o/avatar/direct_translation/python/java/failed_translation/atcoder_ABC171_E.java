
import java.util.*;
import java.util.stream.*;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] a = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int total = 0;
        for (int ai : a) {
            total ^= ai;
        }
        String result = Arrays.stream(a)
                              .mapToObj(ai -> String.valueOf(ai ^ total))
                              .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}

