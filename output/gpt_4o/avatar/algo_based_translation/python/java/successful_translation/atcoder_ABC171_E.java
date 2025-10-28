
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int[] a = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int total = Arrays.stream(a).reduce(0, (x, y) -> x ^ y);

        List<String> result = new ArrayList<>();
        for (int ai : a) {
            result.add(String.valueOf(ai ^ total));
        }

        System.out.println(String.join(" ", result));
    }
}

