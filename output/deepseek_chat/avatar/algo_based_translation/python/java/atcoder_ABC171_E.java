import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] a = Arrays.stream(scanner.nextLine().split(" "))
                       .mapToInt(Integer::parseInt)
                       .toArray();
        
        int total = Arrays.stream(a)
                         .reduce(0, (x, y) -> x ^ y);
        
        String result = Arrays.stream(a)
                             .map(ai -> ai ^ total)
                             .mapToObj(String::valueOf)
                             .reduce((s1, s2) -> s1 + " " + s2)
                             .orElse("");
        
        System.out.println(result);
    }
}
