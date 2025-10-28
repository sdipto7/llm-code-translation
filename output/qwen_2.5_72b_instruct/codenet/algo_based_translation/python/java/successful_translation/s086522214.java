
import java.util.*;
import java.util.stream.IntStream;

public class s086522214 {
    public static List<Integer> prime_decomposition(int n) {
        int i = 2;
        List<Integer> table = new ArrayList<>();
        while (i * i <= n) {
            while (n % i == 0) {
                n /= i;
                table.add(i);
            }
            i++;
        }
        if (n > 1) {
            table.add(n);
        }
        return table;
    }

    public static List<Integer> digit(int i) {
        if (i > 0) {
            List<Integer> result = digit(i / 10);
            result.add(i % 10);
            return result;
        } else {
            return new ArrayList<>();
        }
    }

    public static int getNearestValueIndex(List<Integer> list, int num) {
        int idx = IntStream.range(0, list.size())
                .reduce((a, b) -> Math.abs(list.get(a) - num) < Math.abs(list.get(b) - num) ? a : b)
                .getAsInt();
        return idx;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String[] T = S.split("/");
        int date = Integer.parseInt(T[1] + T[2]);
        if (date <= 430) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}

