
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.Arrays;

public class s086522214 {

    public static List<Integer> primeDecomposition(int n) {
        int i = 2;
        List<Integer> table = new ArrayList<>();
        while (i * i <= n) {
            while (n % i == 0) {
                n /= i;
                table.add(i);
            }
            i += 1;
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
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        int idx = 0;
        int minDiff = Math.abs(array[0] - num);
        for (int j = 1; j < array.length; j++) {
            int diff = Math.abs(array[j] - num);
            if (diff < minDiff) {
                minDiff = diff;
                idx = j;
            }
        }
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

