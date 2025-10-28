
import java.util.ArrayList;
import java.util.Scanner;

public class s086522214 {

    public static ArrayList<Integer> primeDecomposition(int n) {
        int i = 2;
        ArrayList<Integer> table = new ArrayList<>();
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

    public static ArrayList<Integer> digit(int i) {
        ArrayList<Integer> result = new ArrayList<>();
        if (i > 0) {
            result.addAll(digit(i / 10));
            result.add(i % 10);
        }
        return result;
    }

    public static int getNearestValueIndex(int[] list, int num) {
        int minDiff = Integer.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i < list.length; i++) {
            int diff = Math.abs(list[i] - num);
            if (diff < minDiff) {
                minDiff = diff;
                idx = i;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String[] T = S.split("/");
        int date = Integer.parseInt(T[1] + T[2]);
        if (date <= 430) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
        scanner.close();
    }
}

