
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.math.BigInteger;
import java.util.function.Function;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Map<String, String> environ = System.getenv();
        Function<Object[], Void> dbg = environ.containsKey("TERM_PROGRAM") ? (x -> {
            System.out.println(x);
            return null;
        }) : (x -> null);
        Function<Void, String> input = () -> stdin.nextLine().strip();
        Function<String, List<Integer>> LMIIS = (s) -> List.of(input.apply(null).split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
        Function<String, Integer> II = (s) -> Integer.parseInt(input.apply(null));
        int P = 1000000007;
        int INF = 1000000010;
        String[] parts = input.apply(null).split(" ");
        String sa = parts[0];
        String sb = parts[1];
        int a = Integer.parseInt(sa);
        int b = (int) (Double.parseDouble(sb) * 100 + 0.1);
        System.out.println(a * b / 100);
    }
}

