
import java.util.*;
import java.util.stream.Collectors;
import org.apache.commons.math3.util.ArithmeticUtils;

public class s086522214 {
    public static List<Integer> primeDecomposition(int n) {
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
    
    public static int getNearestValueIndex(List<Double> list, double num) {
        int idx = 0;
        double minDiff = Double.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            double diff = Math.abs(list.get(i) - num);
            if (diff < minDiff) {
                minDiff = diff;
                idx = i;
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

