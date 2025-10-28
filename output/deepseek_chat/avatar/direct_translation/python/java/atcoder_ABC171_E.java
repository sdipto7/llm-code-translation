



import java.util.*;
import java.util.stream.*;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            a.add(sc.nextInt());
        }
        int total = a.stream().reduce(0, (x, y) -> x ^ y);
        List<String> result = a.stream().map(x -> String.valueOf(x ^ total)).collect(Collectors.toList());
        System.out.println(String.join(" ", result));
    }
}
