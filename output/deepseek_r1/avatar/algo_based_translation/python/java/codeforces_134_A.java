
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_134_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        List<Integer> w = new ArrayList<>();
        for (String numStr : inputArray) {
            w.add(Integer.parseInt(numStr));
        }
        int x = 0;
        for (int num : w) {
            x += num;
        }
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int currentElement = w.get(i);
            int nMinus1 = n - 1;
            if (nMinus1 != 0) {
                double conditionValue = (x - currentElement) / (double) nMinus1;
                if (conditionValue == currentElement) {
                    d.add(i + 1);
                }
            }
        }
        System.out.println(d.size());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < d.size(); i++) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(d.get(i));
        }
        System.out.println(result);
    }
}

